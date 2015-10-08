package org.klipdev;

import java.util.Hashtable;

// Manages the list of traces
public class SGTraceLib {
	Hashtable traceHT;
	
	SGTraceLib() {
		traceHT = new Hashtable();
		
		// TST: add dummy descriptor 
		SGTraceDescriptor desc = new SGTraceDescriptor( "/trace.tcx" );
		traceHT.put(desc.getUID(), desc);
	};
	
	Boolean AddTrace( SGTraceDescriptor tr ) {
		return false;
	}
}
