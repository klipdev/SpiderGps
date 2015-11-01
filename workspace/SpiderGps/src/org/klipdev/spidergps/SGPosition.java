package org.klipdev.spidergps;

public class SGPosition {
	// TODO: change params order: lon first, then lat
	SGPosition( double lat, double lon, double ele ) {
		latitude  = lat;
		longitude = lon;

		elevation = (float)ele;
		
		mergePoint = false;
	}
	
	double latitude;		// Latitude
	double longitude;		// Longitude
	float elevation;
	
	boolean mergePoint;
}
