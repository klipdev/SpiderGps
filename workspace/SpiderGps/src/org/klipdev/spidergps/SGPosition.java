package org.klipdev.spidergps;

public class SGPosition {
	SGPosition( double lat, double lon, double ele ) {
		latitude  = lat;
		longitude = lon;
		elevation = ele;
	}
	
	double latitude;		// Latitude
	double longitude;		// Longitude
	double elevation;
}
