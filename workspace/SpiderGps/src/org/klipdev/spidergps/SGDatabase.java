package org.klipdev.spidergps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SGDatabase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1950735123746065760L;

	private static final int version0 = 0;	// Current version
	
	private static final int verHigh = version0;
	private static final int verLow  = 1;
	
	
	String dbFilename = new String();

	SGTraceLib traceLib   = new SGTraceLib();
	SGWebOfSegments wos = new SGWebOfSegments();
	
	public SGDatabase() {
		
	}
	
	public boolean hasChanged() {
		// TODO: detect if changes have been saved.
		return false;
	}
	public void save() {
		File f = new File( dbFilename );
		ObjectOutputStream oos = null;

		try {
			if ( !f.exists() ) {
				f.createNewFile();
			}
			oos =  new ObjectOutputStream( new FileOutputStream(f) );
			oos.writeObject( this ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if ( oos != null ) {
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		return;
	}
	
	public void saveAs( String fname ) {
		dbFilename = fname;
		save();
		return;
	}
	
	public static SGDatabase open( String fname ) {
		SGDatabase db = null;
		File f = new File( fname );
		ObjectInputStream ois = null;
		try {
			if ( !f.exists() ) {
				SGTools.Log1( null, "Trying to open a file that doesn't exist.");
				return null;
			}
			ois =  new ObjectInputStream( new FileInputStream(f) );
			db = (SGDatabase) ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if ( ois != null ) {
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return db;
	}
    //-------------------------------------------------------------------------


	private  void writeObject(ObjectOutputStream oos)
	throws IOException {
		oos.writeLong(serialVersionUID);
		oos.writeInt(verHigh);
		oos.writeInt(verLow);
		
		// Serialize 'traceLib'
		oos.writeObject( traceLib );

		// TODO: write 'wos'
	}

	private  void readObject(ObjectInputStream ois)
	throws IOException, ClassNotFoundException {
		long uid = ois.readLong();
		if ( uid != serialVersionUID ) {
			// Wronf file type
			SGTools.Log1(this, "Wrong file type !" );

			// TODO: throw exception
			return;
		}
		
		int vh = ois.readInt();
		int vl = ois.readInt();
		SGTools.Log1(this, "File is version " + vh + "." + vl );
		if ( vh == version0 ) {
			readVersion0( ois );
		} else {
			SGTools.Log1(this, "Incompatible version !" );
		}
	}

	private  void readVersion0(ObjectInputStream ois)
	throws IOException, ClassNotFoundException {
		SGTools.Log1(this, "Entering readVersion0()" );
		
		// De-serialize 'traceLib'
		traceLib = (SGTraceLib) ois.readObject();

		// TODO: read 'wos'
	}
	
    //-------------------------------------------------------------------------
    
	public void addTrace( String filename ) throws Exception {
		SGTraceDescriptor td = SGTraceDescriptor.NewTraceDescriptor( filename );
		
		// TODO Check for doublons
		traceLib.addTrace(td);
	}

	public void addSection(String name, SGPath p) throws Exception {
		SGTraceDescriptor td = SGTraceDescriptor.NewTraceDescriptor(p);
		
		// TODO Check for doublons
		traceLib.addTrace(td);
	}
	
	public void addSection(String name, ArrayList<SGPosition> p) throws Exception {
		SGPath path = new SGPath( name, p );
		SGTraceDescriptor td = SGTraceDescriptor.NewTraceDescriptor(path);
		
		// TODO Check for doublons
		traceLib.addTrace(td);
	}
	
	public void merge() throws Exception {
		ArrayList<SGPosition> path = traceLib.traces.get(0).path.pathSimplified;
		ArrayList<SGPosition> sections = new ArrayList<SGPosition>();
		
		if ( path.size() < 3 ) {
			return;
		}
		
		double sqdist = 0;
		SGPosition p, p1, p2;
		SGPosition np = null;
		double dist = 0;
		int cur = 1;
		int n = 1;
		while ( cur < path.size() ) {
			p = path.get(cur);
			while ( n < path.size() - 1 ) {
				if ( (n != cur) && (n+1 != cur) ) {
					p1 = path.get(n);
					p2 = path.get(n+1);
					sqdist = SGSimplify.getSquareSegmentDistance(p, p1, p2);
					if ( sqdist < 0.0000001 ) {
						np = SGTools.PointSegmentDistanceSquared(p, p1, p2, dist );
						if ( np != null ) {
							// 0. Find common points and ? Not needed... post treatment will take care of that
							dist = DistanceCalculator.distance(p, np, "K");
							dist = DistanceCalculator.distance2(p, np );
			
							// 1. find closest point in P1-P2 segment
							//np = SGTools.getClosestPointOnSegment(p, p1, p2);
/*
							ArrayList<SGPosition> test = new ArrayList<SGPosition>();
							test.add(p1);
							test.add(p2);
							test.add(p);
							test.add(np);
							this.addSection("test1", test);
*/
//							return;
	
							// 2. break segment
							np.mergePoint = true;
	
							// TODO: average of both points
							// TODO: keep log of points
							path.add( n+1, np );
							n = n + 1;	// One extra count because we added 1 element
							if ( n < cur ) {
								// TODO: test this scenario, where a point intersect with a previous section
								cur = cur + 1;
							}
							//return;
						} else {
							// the point is not close to an existing segment ==> let's look for intersections
							// TODO: (1) look for intersection 
						}
					}
				}
				n = n + 1;
			}
			n = 0;
			cur = cur + 1;
		}
		
		//this.addSection("test", path);

		//return;

{
		p = null;
		sqdist = 0;
		boolean inseg = false;	// true if common segment
		int segstart = 0;
		int nbsec = 1;
		//int markers[] = new int[path.size()];	// non zero if position is a segment start/stop
		//markers[0] = 1;
		SGPath sect = new SGPath( "section"+nbsec, 1 );
		//sect.addPosition(lat, lon, elevation);

		int segsize = 1;
		inseg = false;
		boolean poifound = false;
		for ( int i = 0; i < path.size(); i++ ) {
			// Get current point
			p = path.get(i);
			
			int j = i+1;
			while ( poifound == false ) {
				if ( j < path.size() ) {
					p2 = path.get( j );

					sqdist = SGSimplify.getSquareDistance(p, p2);
					if ( sqdist <= 0.0000001 ) {
						if ( inseg == false ) {
							// end of seg ==> add it to lib and start new seg
							inseg = true;
						} else {
							
						}
						poifound = true;	// End of path is a POI
					} else {
						if ( inseg == true ) {
							// end of seg ==> add it to lib and start new seg
							inseg = false;
						} else {
							
						}
						poifound = true;	// End of path is a POI
					}
					
					j++;
				} else {				
					poifound = true;	// End of path is a POI ?
				}
			}
		}
		
		
		// Start with first point, and then look for next POI: intersection of common point
		for ( int i = 0; i < path.size(); i++ ) {
			// Get current point
			p = path.get(i);
			
			// Find common point ot intersection
			for ( int j = i+1; j < path.size(); j++ ) {
				if ( j != i ) {		// Always true...
					p2 = path.get(j);
					sqdist = SGSimplify.getSquareDistance(p, p2);
					if ( sqdist <= 0.0000001 ) {
						// Common point found
						// where we in a segment ?
						if ( inseg == true || i == 0 ) {
							// Yes: continue seg
						} else {
							// No: start new seg
							sect.addPosition(p2.latitude, p2.longitude, p2.elevation);
							this.addSection("", sect);
							segstart = i;
							nbsec++;
							sect = new SGPath("section"+nbsec, 1);
						}
					} else if (0==1) {
						// TODO: (1) check if p2 is intersection
					} else {
						// No common point found
						if ( inseg == false ) {
							// Continue current section
						} else {
							// leaving a common section
						}
					}
				}
			}
		}
}

/*
		// Find sections !
		int markers[] = new int[path.size()];

		SGPath sect;
		sect = new SGPath( "section", 1 );

		sqdist = 0;
		cur = 0;
		n = 1;
		int nbSect = 1;
		//boolean newSect = true;
		while ( cur < path.size() ) {
			if ( markers[cur] == 0 ) {
				markers[cur] = 1;

				// Add point to section
				p = path.get(cur);
				sect.addPosition( p.latitude, p.longitude, p.elevation);

				for ( n = cur + 1; n < path.size(); n++  ) {
					p2 = path.get(n);
					sqdist = SGSimplify.getSquareDistance(p, p2);
					if ( sqdist <= 0.0000001 ) {
						markers[n] += 2;
						markers[cur] ++;
					}
				}
				
				if ( cur > 0 ) {
					if ( markers[cur] != markers[cur-1] ){
						this.addSection(sect);
						sect = new SGPath("section", 1);
						nbSect ++;
					}
				}
			}
			cur++;
		}*/
	}
}
