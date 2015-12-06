package org.klipdev.spidergps;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SGPosition implements Serializable {
	double latitude;		// Latitude
	double longitude;		// Longitude
	float elevation;
	
	boolean mergePoint;

	// TODO: change params order: lon first, then lat
	SGPosition( double lat, double lon, double ele ) {
		latitude  = lat;
		longitude = lon;

		elevation = (float)ele;
		
		mergePoint = false;
	}
	
	private  void writeObject(ObjectOutputStream oos)
	throws IOException {
	}

	private  void readObject(ObjectInputStream ois)
	throws IOException, ClassNotFoundException {
	}
}
