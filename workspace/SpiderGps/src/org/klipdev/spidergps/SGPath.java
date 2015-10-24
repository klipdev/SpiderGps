/**
 * 
 */
package org.klipdev.spidergps;

import java.util.ArrayList;

/**
 * @author Christophe
 *
 */
public class SGPath {
	String name;		// Path name
	GPArea area;
	
	ArrayList<SGPosition> path;
	double distance; 	// distance in km;
	double elevationP;	// positive elevation in meters
	double elevationN;	// negative elevation in meters
	int nbPosPerKm;	    // Used for filtering
	
	SGPath( String s, int size ) {
		name = s;
		elevationP = elevationN = 0;
		area = new GPArea();
		path = new ArrayList<SGPosition>();
		path.ensureCapacity(size);
	}
	
	void reset() {
		path.clear();
	}

	// Add a position to a path, determine the total area, calculates distance
	void addPosition( double lat, double lon, double elevation ) {
		// Add position
		path.add( new SGPosition(lat, lon, elevation) );

		if (path.size() == 1 ) {
			elevationP = elevationN = 0;
			distance  = 0;
			area.init( lat, lon );
		} else {
			// Determine area
			if (lat > area.latitudeN ) {
				area.latitudeN = lat;
			} else if ( lat < area.latitudeS ) {
				area.latitudeS = lat;
			}
			if (lon > area.longitudeE ) {
				area.longitudeE = lon;
			} else if ( lon < area.longitudeW ) {
				area.longitudeW = lon;
			}
			
			SGPosition prev = path.get(path.size()-2);
			// Calculate distance
			distance = distance + DistanceCalculator.distance(prev.latitude, prev.longitude, lat, lon, "K" );
			
			
			// Calculate elevation
			// TODO: filter elevation
			double deltaEle = elevation - prev.elevation;
			if ( deltaEle > 0 ) {
				elevationP = elevationP + deltaEle;
			} else if (deltaEle < 0 ) {
				elevationN = elevationN + deltaEle;
			}
		}
	}

	String getStatsAsString() {
		String s = String.format("Name: %s\n  Distance: %.2f km\n  D+: %.0f m\n  D-: %.0f m\n", name, distance, elevationP, elevationN );
		return s;
	}
}
