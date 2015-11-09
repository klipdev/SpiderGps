package org.klipdev.spidergps;

public class SGArea {
	SGArea() {
		latitudeN = 0;
		latitudeS = 0;
		longitudeW  = 0;
		longitudeE  = 0;
	}
	
	void init( double lat, double lon ) {
		latitudeN = latitudeS = lat; 
		longitudeW = longitudeE = lon;
	}
	
	// Returns true if there is an overlap between this area and the area parameter.
	boolean overlapsArea( SGArea a ) {
		if ( a.latitudeN < latitudeS ) {
			return false;
		} else if ( a.latitudeS > latitudeN ) {
			return false;
		} else if ( a.longitudeE < longitudeW ) {
			return false;
		} else if ( a.longitudeW > longitudeE ) {
			return false;
		}
		
		return true;
	}

	double latitudeN;
	double longitudeW;
	double latitudeS;
	double longitudeE;
}
