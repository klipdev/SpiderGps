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
	
	
	public void merge() {
		ArrayList<SGPosition> path = traceLib.traces.get(0).path.path;
		ArrayList<SGPosition> sections = new ArrayList<SGPosition>();
		
		if ( path.size() < 3 ) {
			return;
		}
		
		double sqdist = 0;
		SGPosition p, p1, p2;
		SGPosition np;
		int cur = 0;
		int n = 1;
		while ( cur < path.size() ) {
			p = path.get(cur);
			while ( n < path.size() - 1 ) {
				p1 = path.get(n);
				p2 = path.get(n+1);
				sqdist = SGSimplify.getSquareSegmentDistance(p, p1, p2);
				if ( sqdist < 0.00012 ) {
					// Do something, but what ?
					// 0. Find common points and ? Not needed... post treatment will take care of that
	
					// 1. find closest point in P1-P2 segment
					np = SGTools.getClosestPointOnSegment(p, p1, p2);
					np.mergePoint = true;
	
					// 2. break segment
					if ( np != null ) {
						// TODO: average of both points
						// TODO: keep log of points
						path.add( n, np );
						n = n + 1;	// One extra count because we added 1 element
						cur = cur + 1;
					}
					n = n + 1;
				}
			}
			n = 0;
			cur = cur + 1;
		}
	}

}
