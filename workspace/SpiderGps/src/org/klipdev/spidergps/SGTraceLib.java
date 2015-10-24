package org.klipdev.spidergps;

import java.util.ArrayList;

// Manages the list of traces
public class SGTraceLib {
	ArrayList<SGTraceDescriptor> traces;
	
	SGTraceLib() {
		traces = new ArrayList<SGTraceDescriptor>();
		
		// TST: add dummy descriptor 
//		SGTraceDescriptor desc = new SGTraceDescriptor( "/trace.tcx" );
//		traceHT.put(desc.getUID(), desc);
	};
	
	void addTrace( SGTraceDescriptor td ) {
		traces.add(td);
		
	}
}
