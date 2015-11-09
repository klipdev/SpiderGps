package org.klipdev.spidergps;

import java.awt.Point;
import java.util.ArrayList;

public class SGDatabase {
	SGTraceLib traceLib   = new SGTraceLib();
	SGWebOfSegments wps = new SGWebOfSegments();
	
	public SGDatabase() {
		
	}
	

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
		int markers[] = new int[path.size()];	// non zero if position is a segment start/stop
		markers[0] = 1;
		SGPath sect = new SGPath( "section"+nbsec, 1 );
		//sect.addPosition(lat, lon, elevation);
		for ( int i = 1; i < path.size(); i++ ) {
			// Get current point
			p = path.get(i);
			
			// Find common point
			for ( int j = i+1; j < path.size(); j++ ) {
				if ( j != i ) {
					p2 = path.get(j);
					sqdist = SGSimplify.getSquareDistance(p, p2);
					if ( sqdist <= 0.0000001 ) {
						// Intersection found
						// where we in a segment ?
						if ( inseg == true ) {
							// Yes: continue seg???
						} else {
							// No: new seg
							sect.addPosition(p2.latitude, p2.longitude, p2.elevation);
							this.addSection("", sect);
							segstart = i;
							nbsec++;
							sect = new SGPath("section"+nbsec, 1);
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
