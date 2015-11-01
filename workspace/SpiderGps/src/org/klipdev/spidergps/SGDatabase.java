package org.klipdev.spidergps;

import java.awt.Point;
import java.util.ArrayList;

public class SGDatabase {
	SGTraceLib traceLib   = new SGTraceLib();
	SGTraceLib sectionLib = new SGTraceLib();
	
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
		int cur = 0;
		int n = 1;
		while ( cur < path.size() ) {
			p = path.get(cur);
			while ( n < path.size() - 1 ) {
				if ( (n != cur) && (n+1 != cur) ) {
					p1 = path.get(n);
					p2 = path.get(n+1);
					sqdist = SGSimplify.getSquareSegmentDistance(p, p1, p2);
					if ( sqdist < 0.00012 ) {
						np = SGTools.PointSegmentDistanceSquared(p, p1, p2, dist );
						if ( np != null ) {
							// 0. Find common points and ? Not needed... post treatment will take care of that
							dist = DistanceCalculator.distance(p, np, "K");
							dist = DistanceCalculator.distance2(p, np );
			
							// 1. find closest point in P1-P2 segment
							//np = SGTools.getClosestPointOnSegment(p, p1, p2);
							ArrayList<SGPosition> test = new ArrayList<SGPosition>();
							test.add(p1);
							test.add(p2);
							test.add(p);
							test.add(np);
							this.addSection("test1", test);
	//						return;
	
							// 2. break segment
							np.mergePoint = true;
	
							// TODO: average of both points
							// TODO: keep log of points
							path.add( n+1, np );
							n = n + 1;	// One extra count because we added 1 element
							cur = cur + 1;
							return;
						}
					}
				}
				n = n + 1;
			}
			n = 0;
			cur = cur + 1;
		}
		
		this.addSection("test", path);

		return;
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
					if ( sqdist <= 0.00012 ) {
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
