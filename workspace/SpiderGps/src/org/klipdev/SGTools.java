package org.klipdev;

public class SGTools extends KDTools {
	private SGTools() { };
	
	final static private int LOG_LVL_NONE  = 1;
	final static private int LOG_LVL_LIGHT = 2;
	final static private int LOG_LVL_ALL   = 3;

	
	static private int logLevel = LOG_LVL_ALL;
	
	static void Log1(Object o, String s ) {
		if ( logLevel == LOG_LVL_NONE ) {
			return;
		} else if ( logLevel == LOG_LVL_LIGHT ) {
			String ss = String.format("[%s] %s", o.getClass(), s );

			// TODO: replace \n by line header
			//			ss.replaceAll("", replacement)
			System.out.println( ss );
		}
	}
}
