package org.klipdev.spidergps;

import java.util.ArrayList;

// Contains the networks of all segments
public class SGWebOfSegments {
	ArrayList<SGRideArea> rideAreas = new ArrayList<SGRideArea>();

	public SGWebOfSegments() {
	}
	
	// A segment is added to an area if it has at least 1 common position with the area 
	// return true if new segment added or already existing
	// return false if new segment can't be added.
	public boolean addSegment( SGSegment s ) {
		boolean added = false;
		
		if ( s == null ) {
			SGTools.Log1(this, "Can't add null segment to WoS !" );
			return false;
		}

		int i = 0;
		while ( i < rideAreas.size() && added == false ) {
			 added = rideAreas.get(i).addSegment( s );
			 i++;
		}

		if ( added == true ) {
			// Successfully added ==> Need to check if can be added to another area.
			// If yes ==> merge areas
			boolean found = false;
			for ( ; i < rideAreas.size(); i++ ) {
				found = rideAreas.get(i).addSegment( s );
				if ( found == true ) {
					// the new segment matches a second area ==> need to merge !
					// TODO: merge areas
				}
			}
		} else { 
			// Not added ==> create new ride area
		}
		return true;
	}
}
