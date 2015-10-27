package org.klipdev.spidergps;

import java.awt.Point;

public class SGTools extends KDTools {
	private SGTools() { };
	
	final static private int LOG_LVL_NONE  = 1;
	final static private int LOG_LVL_LIGHT = 2;
	final static private int LOG_LVL_ALL   = 3;

	
	static private int logLevel = LOG_LVL_ALL;
	
	static void Log1(Object o, String s ) {
		if ( logLevel == LOG_LVL_NONE ) {
			return;
		} else { //if ( logLevel == LOG_LVL_LIGHT ) {
			String ss = String.format("[%s] %s", o.getClass(), s );

			// TODO: replace \n by line header
			//			ss.replaceAll("", replacement)
			System.out.println( ss );
		}
	}
	
	
	
	

	  /**
	   * Returns closest point on segment to point
	   * Source: http://www.java2s.com/Code/Java/2D-Graphics-GUI/Returnsclosestpointonsegmenttopoint.htm
	   * 
	   * @param ss
	   *            segment start point
	   * @param se
	   *            segment end point
	   * @param p
	   *            point to found closest point on segment
	   * @return closest point on segment to p
	   */
	  public static SGPosition getClosestPointOnSegment(SGPosition p, SGPosition ss, SGPosition se)
	  {
	    return getClosestPointOnSegment(ss.longitude, ss.latitude, se.longitude, se.latitude, p.longitude, p.latitude);
	  }

	  /**
	   * Returns closest point on segment to point
	   * 
	   * @param sx1
	   *            segment x coord 1
	   * @param sy1
	   *            segment y coord 1
	   * @param sx2
	   *            segment x coord 2
	   * @param sy2
	   *            segment y coord 2
	   * @param px
	   *            point x coord
	   * @param py
	   *            point y coord
	   * @return closets point on segment to point
	   */
	  public static SGPosition getClosestPointOnSegment(double px, double py, double sx1, double sy1, double sx2, double sy2 )
	  {
		// TODO Handle elevation!
	    double xDelta = sx2 - sx1;
	    double yDelta = sy2 - sy1;

	    if ((xDelta == 0) && (yDelta == 0))
	    {
	      throw new IllegalArgumentException("Segment start equals segment end");
	    }

	    double u = ((px - sx1) * xDelta + (py - sy1) * yDelta) / (xDelta * xDelta + yDelta * yDelta);

	    final SGPosition closestPoint;
	    if (u < 0)
	    {
	      //closestPoint = new SGPosition(sx1, sy1, 0);
	    	// Ignore extremities
	    	return null;
	      
	    }
	    else if (u > 1)
	    {
//	      closestPoint = new SGPosition(sx2, sy2, 0);
	    	// Ignore extremities
	    	return null;
	    }
	    else
	    {
	      closestPoint = new SGPosition((int) Math.round(sx1 + u * xDelta), (int) Math.round(sy1 + u * yDelta), 0);
	    }

	    return closestPoint;
	  }
}
