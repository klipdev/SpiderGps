package org.klipdev.spidergps;


// Contains the network of segment related to a given area
public class SGRideArea {
	SGPosition topLeft = new SGPosition(0,0,0);
	SGPosition bottomRight = new SGPosition(0,0,0);
	
	//ArrayList<SGSegment>
	SGSegment initialSegment = null;

	SGRideArea( SGSegment s ) {
		addSegment( s );
	}
	
	// Returns false is segment can't be added
	public boolean addSegment( SGSegment s ) {
		if ( s == null ) {
			SGTools.Log1(this, "Can't add null segment to ride area !");
			return false;
		}
		if ( initialSegment == null ) {
			initialSegment = s;
			// TODO
			topLeft = initialSegment.
		} else {
			
		}

		return false;
	}
}
