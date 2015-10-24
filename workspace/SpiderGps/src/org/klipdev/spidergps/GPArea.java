package org.klipdev.spidergps;

public class GPArea {
	GPArea() {
		latitudeN = 0;
		latitudeS = 0;
		longitudeW  = 0;
		longitudeE  = 0;
	}
	
	void init( double lat, double lon ) {
		latitudeN = latitudeS = lat; 
		longitudeW = longitudeE = lon;
	}
	double latitudeN;
	double longitudeW;
	double latitudeS;
	double longitudeE;
}
