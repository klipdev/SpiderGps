/**
 * 
 */
package org.klipdev.spidergps;

import java.util.ArrayList;
import java.util.Locale;

/**
 * @author Christophe
 *
 */
public class SGPath {
	String name;		// Path name
	GPArea area;
	
	ArrayList<SGPosition> path;
	ArrayList<SGPosition> pathSimplified;
	
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
		
		pathSimplified = null;
	}
	
	void reset() {
		path.clear();
	}

	void simplify() {
		// 0.0001 seems ok, could be filtered more
		// 0.0003 too strong
		// 0.00015 ok. a bit strong? yes, too strong
		// 0.00012 ok for now. Too strong ?
		pathSimplified = SGSimplify.simplify(path, 0.00012);

		SGTools.Log1(this, "Full size      : " + path.size() + "points" );
		SGTools.Log1(this, "Simplified size: " + pathSimplified.size() + "points - " + (path.size() / pathSimplified.size()) + "x smaller" );
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

	String getJSStringAddSection() {
		String js = new String("addSection( 'lkj', [");

		for ( SGPosition pos: pathSimplified ) {
			js = js + String.format(Locale.ENGLISH, "[%f, %f],", pos.latitude, pos.longitude );
		}
		js = js + "]);";
		js.replaceAll("],]", "]]" );
///////
		//TST
		String js2 = new String("addSection( 'lkj', [");

		for ( SGPosition pos2: path ) {
			js2 = js2 + String.format(Locale.ENGLISH, "[%f, %f],", pos2.latitude, pos2.longitude );
		}
		js2 = js2 + "]);";
		js2.replaceAll("],]", "]]" );
		//js = js + "\n" + js2;
///////
		
		SGTools.Log1(this,  js );
		
		return js;
	}
	
	
	String getStatsAsString() {
		String s = String.format("Name: %s\n  Distance: %.2f km\n  D+: %.0f m\n  D-: %.0f m\n", name, distance, elevationP, elevationN );
		return s;
	}
}
