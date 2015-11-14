package org.klipdev.spidergps;

import java.util.ArrayList;

// Contains the network of segment related to a given area
public class SGRideArea {
	SGArea area = new SGArea();
	
	ArrayList<SGSegment> segments = new ArrayList<SGSegment>();

	SGRideArea( SGSegment s ) {
		addSegment( s );
	}
	
	// Returns false if segment can't be added
	public boolean addSegment( SGSegment s ) {
		if ( s == null ) {
			SGTools.Log1(this, "Can't add null segment to ride area !");
			return false;
		}

		if ( segments.isEmpty() ) {
			// No segment exists yet in this area

			area.latitudeN  = s.area.latitudeN;
			area.latitudeS  = s.area.latitudeS;
			area.longitudeE = s.area.longitudeE;
			area.longitudeW = s.area.longitudeW;
			
			
			// TODO: (1) detect segments within this new segment? done before ?
			
			segments.add(s);
		} else {
			// Let's try to add this new segment...
			if ( s.area.overlapsArea( area ) == false ) {
				// No overlap
				return false;
			}
			
			// Still there? The segment area then overlaps this ride area !
			boolean sp1in = true, sp2in = true; 	// true if p1 or p2 are in the area of a line
			SGPosition sp1, sp2, p1, p2;
			for ( SGSegment seg: segments ) {
				if ( seg.area.overlapsArea( s.area ) ) {
					// Segment are located in the same area
					// Let's detect intersections etc...
					
					// Parse segment
					for ( int i = 1; i < seg.path.size(); i++ ) {
						p1 = seg.path.get( i - 1 );
						p2 = seg.path.get( i );
						
						// Init
						sp1 = s.path.get( 0 );
						if ( ( sp1.latitude > p1.latitude && sp1.latitude > p2.latitude ) ||
							 ( sp1.latitude < p1.latitude && sp1.latitude < p2.latitude ) ||
							 ( sp1.longitude > p1.longitude && sp1.longitude > p2.longitude ) ||
							 ( sp1.longitude < p1.longitude && sp1.longitude < p2.longitude ) ) {
							sp1in = false;
						}
						// Loop
						for ( int j = 1; j < s.path.size(); j++ ) {
							sp2 = s.path.get( j );

							// Detect intersections
							if ( ( sp2.latitude > p1.latitude && sp2.latitude > p2.latitude ) ||
							     ( sp2.latitude < p1.latitude && sp2.latitude < p2.latitude ) ||
							     ( sp2.longitude > p1.longitude && sp2.longitude > p2.longitude ) ||
							     ( sp2.longitude < p1.longitude && sp2.longitude < p2.longitude ) ) {
								// OUT
								sp2in = false;
							}
							     
							if ( sp1in == true || sp2in == true) {
								// Look for intersection. There may not be any
								SGPosition inter = SGTools.getIntersection(p1, p2, sp1, sp2);
								if ( inter == null ) {
									// No intersection
								} else {
									// TODO: do something
								}
							}

							// END ITERATION
							sp1   = sp2;
							sp1in = sp2in;
						}
					}
				}
				
////////////////////////////////////
/*			
				if ( path.size() < 3 ) {
					return;
				}
*/				
/*
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

//									return;
			
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
*/
///////////////////////////
			}
		}

		return false;
	}
	
	public boolean mergeSegments( SGSegment s1, SGSegment s2 ) {
		return false;
	}
}
