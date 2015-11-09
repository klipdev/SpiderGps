package org.klipdev.spidergps;

import java.util.ArrayList;

public class SGSegment extends SGPath {
	SGPosition startPos;
	SGPosition endPos;
	
	ArrayList<SGSegment> startSeg;
	ArrayList<SGSegment> endSeg;

	SGSegment( String s, ArrayList<SGPosition> p ) {
		super( s, p );
		
		if ( p.isEmpty() ) {
			SGTools.Log1(this, "Creation of an empty segment !");
			return;
		}
		startPos = p.get(0);
		endPos   = p.get(p.size()-1);
		
		// TODO: detect if segment is too short
	}
}
