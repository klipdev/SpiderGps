package org.klipdev.spidergps;

public class SGDatabase {
	SGTraceLib traceLib   = new SGTraceLib();
	SGTraceLib sectionLib = new SGTraceLib();
	
	public SGDatabase() {
		
	}
	

	public void addTrace( String filename ) throws Exception {
		SGTraceDescriptor td = SGTraceDescriptor.NewTraceDescriptor( filename );
		
		// TODO Check for doublons
		traceLib.addTrace(td);
	}
	
}
