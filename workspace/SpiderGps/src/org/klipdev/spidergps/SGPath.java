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
	SGArea area;
	
	ArrayList<SGPosition> path;
	ArrayList<SGPosition> pathSimplified;
	
	float distance; 	// distance in km;
	float elevationP;	// positive elevation in meters
	float elevationN;	// negative elevation in meters
	
	SGPath( String s, int size ) {
		name = s;
		elevationP = elevationN = 0;
		area = new SGArea();
		path = new ArrayList<SGPosition>();
		path.ensureCapacity(size);
		
		pathSimplified = null;
	}
	
	SGPath( String s, ArrayList<SGPosition> p ) {
		name = s;
		elevationP = elevationN = 0;
		area = new SGArea();
		path = p;
		pathSimplified = null;
		
		// Calculate distance, elevation
		calculateStatistics();
	}

	void reset() {
		path.clear();
		clearStatistics();
	}

	void clearStatistics() {
		distance = 0;
		elevationP = 0;
		elevationN = 0;
	}
	void calculateStatistics() {
		clearStatistics();
		if (path.size() == 0) {
			return;
		}

		SGPosition pos1, pos2;
		pos1 = path.get(0);
		for ( int i = 1; i < path.size(); i++ ) {
			pos2 = path.get(i);
			distance = distance + (float)DistanceCalculator.distance(pos1.latitude, pos1.longitude, pos2.latitude, pos2.longitude, "K" );

			float deltaEle = pos2.elevation - pos1.elevation;
			if ( deltaEle > 0 ) {
				elevationP = elevationP + deltaEle;
			} else if (deltaEle < 0 ) {
				elevationN = elevationN + deltaEle;
			}
		}
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
			distance = distance + (float)DistanceCalculator.distance(prev.latitude, prev.longitude, lat, lon, "K" );
						
			// Calculate elevation
			// TODO: filter elevation
			float deltaEle = (float)(elevation - prev.elevation);
			if ( deltaEle > 0 ) {
				elevationP = elevationP + deltaEle;
			} else if (deltaEle < 0 ) {
				elevationN = elevationN + deltaEle;
			}
		}
	}

	int id = 0;
	String getJSStringAddSection() {
		id++;
		String js = new String("addSection( 'Section #" + id + "', [");

		if ( pathSimplified == null ) {
			// For sections
			for ( SGPosition pos: path ) {
				js = js + String.format(Locale.ENGLISH, "[%f, %f],", pos.latitude, pos.longitude );
			}
		} else {
			for ( SGPosition pos: pathSimplified ) {
				js = js + String.format(Locale.ENGLISH, "[%f, %f],", pos.latitude, pos.longitude );
			}
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
