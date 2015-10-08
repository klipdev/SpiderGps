package org.klipdev;

import java.time.LocalDateTime;

import com.teamdev.jxbrowser.chromium.ReloadPostDataParams;

public class SGTraceDescriptor {
	public static final int FILETYPE_TCX = 1;
	public static final int FILETYPE_GPX = 2;
	public static final int FILETYPE_KML = 3;

	String filenameLong;
	String filenameShort;

	// tcx, kml, gpx...
	int fileType;

	// TODO/1: add square obj for trace area
	// true to show trace on map
	Boolean showOnMap;
	
	// Unique ID to identify the descriptor. 0 = not set
	long uid;

	// date of track run or route creation
	LocalDateTime traceDate;
	
	SGTraceDescriptor(String filename) {
		showOnMap    = false;
		filenameLong = filename;
		
		// TODO: generate file name short
		filenameShort = "";
		
		// TODO: detect filetype from file
		fileType = FILETYPE_TCX;
		
		// Generate UID
		uid = UIDGen.nextId();
		
		traceDate = readTimeFromFile();
	}
	
	long getUID() {
		return uid;
	}
	
	LocalDateTime readTimeFromFile() {
		// TODO: get date/time from file
		return LocalDateTime.now();
	}
}
