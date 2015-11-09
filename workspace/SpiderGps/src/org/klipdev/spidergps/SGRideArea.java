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
			
			segments.add(s);
		} else {
			// Let's try to add this new segment...
			if ( s.area.overlapsArea( area ) == false ) {
				// No overlap
				return false;
			}
			
			// Still there? The segment area then overlaps this ride area !
		}

		return false;
	}
}
