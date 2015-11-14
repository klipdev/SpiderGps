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
	
	// This works on a plane, but produces errors when used on spherical geometry
	// Still gives an approximation, to be improved later with a better algorithm
	// I'm working with very small distance so might still be acceptable to use this algorithm.
	// TODO: (3) find better intersection algo
	public static SGPosition getIntersection( SGPosition A1, SGPosition B1, SGPosition A2, SGPosition B2 ) {
		double X1sum = A1.longitude - B1.longitude;
		double X2sum = A2.longitude - B2.longitude;
		double Y1sum = A1.latitude - B1.latitude;
		double Y2sum = A2.latitude - B2.latitude;
	
		double LineDenominator = X1sum * Y2sum - Y1sum * X2sum;
		// TODO: (3) not sure a comparison with 0.0 is a good idea. Could be better with a small threshold
		if ( LineDenominator == 0.0 ) {
		    return null;
		}
	
		double a = A1.longitude * B1.latitude - A1.latitude * B1.longitude;
		double b = A2.longitude * B2.latitude - A2.latitude * B2.longitude;
	
		double x = (a * X2sum - b * X1sum) / LineDenominator;
		double y = (a * Y2sum - b * Y1sum) / LineDenominator;
		
		return new SGPosition( y, x, 0 );
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
	      //closestPoint = new SGPosition(sy1, sx1, 0);
	    	// Ignore extremities
	    	return null;
	      
	    }
	    else if (u > 1)
	    {
//	      closestPoint = new SGPosition(sy2, sx2, 0);
	    	// Ignore extremities
	    	return null;
	    }
	    else
	    {
	      closestPoint = new SGPosition(sy1 + u * yDelta, sx1 + u * xDelta, 0);
	    }

	    return closestPoint;
	  }
	  
	  
	  // Algorithm from https://stackoverflow.com/posts/22618663/revisions
	  // TODO: remove the calculation of 'distance' if not needed
	  public static SGPosition PointSegmentDistanceSquared(SGPosition point, SGPosition lineStart, SGPosition lineEnd, double distance )
	  {
	      double kMinSegmentLenSquared = 0.00000001;		// adjust to suit.  If you use float, you'll probably want something like 0.000001f
	      double kEpsilon = 1.0E-14;						// adjust to suit.  If you use floats, you'll probably want something like 1E-7f
	      double dX   = lineEnd.longitude - lineStart.longitude;
	      double dY   = lineEnd.latitude - lineStart.latitude;
	      double dp1X = point.longitude - lineStart.longitude;
	      double dp1Y = point.latitude - lineStart.latitude;
	      double segLenSquared = (dX * dX) + (dY * dY);
	      double t = 0.0;

	      if (segLenSquared >= -kMinSegmentLenSquared && segLenSquared <= kMinSegmentLenSquared)
	      {
	          // segment is a point.
//	          intersectPoint = lineStart;
//	          t = 0.0;
//	          distance = ((dp1X * dp1X) + (dp1Y * dp1Y));
	    	  return null;
	      }
	      else
	      {
	          // Project a line from p to the segment [p1,p2].  By considering the line
	          // extending the segment, parameterized as p1 + (t * (p2 - p1)),
	          // we find projection of point p onto the line. 
	          // It falls where t = [(p - p1) . (p2 - p1)] / |p2 - p1|^2
	          t = ((dp1X * dX) + (dp1Y * dY)) / segLenSquared;
	          if (t < kEpsilon)
	          {
	        	  return null;
	              // intersects at or to the "left" of first segment vertex (lineStart.X, lineStart.Y).  If t is approximately 0.0, then
	              // intersection is at p1.  If t is less than that, then there is no intersection (i.e. p is not within
	              // the 'bounds' of the segment)
//	              if (t > -kEpsilon)
//	              {
	                  // intersects at 1st segment vertex
//	                  t = 0.0;
//	              }
	              // set our 'intersection' point to p1.
//	              intersectPoint = lineStart;
	              // Note: If you wanted the ACTUAL intersection point of where the projected lines would intersect if
	              // we were doing PointLineDistanceSquared, then intersectPoint.X would be (lineStart.X + (t * dx)) and intersectPoint.Y would be (lineStart.Y + (t * dy)).
	          }
	          else if (t > (1.0 - kEpsilon))
	          {
	        	  return null;
	              // intersects at or to the "right" of second segment vertex (lineEnd.X, lineEnd.Y).  If t is approximately 1.0, then
	              // intersection is at p2.  If t is greater than that, then there is no intersection (i.e. p is not within
	              // the 'bounds' of the segment)
//	              if (t < (1.0 + kEpsilon))
//	              {
	                  // intersects at 2nd segment vertex
//	                  t = 1.0;
//	              }
	              // set our 'intersection' point to p2.
//	              intersectPoint = lineEnd;
	              // Note: If you wanted the ACTUAL intersection point of where the projected lines would intersect if
	              // we were doing PointLineDistanceSquared, then intersectPoint.X would be (lineStart.X + (t * dx)) and intersectPoint.Y would be (lineStart.Y + (t * dy)).
	          }
	          else
	          {
	              // The projection of the point to the point on the segment that is perpendicular succeeded and the point
	              // is 'within' the bounds of the segment.  Set the intersection point as that projected point.
//	              intersectPoint = new SGPosition((lineStart.longitude + (t * dX)), (lineStart.latitude + (t * dY)), 0);
	              SGPosition pos = new SGPosition((lineStart.latitude + (t * dY)), (lineStart.longitude + (t * dX)), 0);
	              
		          double dpqX = point.longitude - pos.longitude;
		          double dpqY = point.latitude - pos.latitude;

		          distance = ((dpqX * dpqX) + (dpqY * dpqY));

	              
	              return pos;
	          }
	          // return the squared distance from p to the intersection point.  Note that we return the squared distance
	          // as an optimization because many times you just need to compare relative distances and the squared values
	          // works fine for that.  If you want the ACTUAL distance, just take the square root of this value.
//	          double dpqX = point.longitude - intersectPoint.longitude;
//	          double dpqY = point.latitude - intersectPoint.latitude;

//	          distance = ((dpqX * dpqX) + (dpqY * dpqY));
	      }

//	      return true;
	  }

/*	  
	  public static bool PointSegmentDistanceSquared(PointF point, PointF lineStart, PointF lineEnd, double distance, PointF intersectPoint)
	  {
	      const double kMinSegmentLenSquared = 0.00000001; // adjust to suit.  If you use float, you'll probably want something like 0.000001f
	      const double kEpsilon = 1.0E-14; // adjust to suit.  If you use floats, you'll probably want something like 1E-7f
	      double dX = lineEnd.X - lineStart.X;
	      double dY = lineEnd.Y - lineStart.Y;
	      double dp1X = point.X - lineStart.X;
	      double dp1Y = point.Y - lineStart.Y;
	      double segLenSquared = (dX * dX) + (dY * dY);
	      double t = 0.0;

	      if (segLenSquared >= -kMinSegmentLenSquared && segLenSquared <= kMinSegmentLenSquared)
	      {
	          // segment is a point.
	          intersectPoint = lineStart;
	          t = 0.0;
	          distance = ((dp1X * dp1X) + (dp1Y * dp1Y));
	      }
	      else
	      {
	          // Project a line from p to the segment [p1,p2].  By considering the line
	          // extending the segment, parameterized as p1 + (t * (p2 - p1)),
	          // we find projection of point p onto the line. 
	          // It falls where t = [(p - p1) . (p2 - p1)] / |p2 - p1|^2
	          t = ((dp1X * dX) + (dp1Y * dY)) / segLenSquared;
	          if (t < kEpsilon)
	          {
	              // intersects at or to the "left" of first segment vertex (lineStart.X, lineStart.Y).  If t is approximately 0.0, then
	              // intersection is at p1.  If t is less than that, then there is no intersection (i.e. p is not within
	              // the 'bounds' of the segment)
	              if (t > -kEpsilon)
	              {
	                  // intersects at 1st segment vertex
	                  t = 0.0;
	              }
	              // set our 'intersection' point to p1.
	              intersectPoint = lineStart;
	              // Note: If you wanted the ACTUAL intersection point of where the projected lines would intersect if
	              // we were doing PointLineDistanceSquared, then intersectPoint.X would be (lineStart.X + (t * dx)) and intersectPoint.Y would be (lineStart.Y + (t * dy)).
	          }
	          else if (t > (1.0 - kEpsilon))
	          {
	              // intersects at or to the "right" of second segment vertex (lineEnd.X, lineEnd.Y).  If t is approximately 1.0, then
	              // intersection is at p2.  If t is greater than that, then there is no intersection (i.e. p is not within
	              // the 'bounds' of the segment)
	              if (t < (1.0 + kEpsilon))
	              {
	                  // intersects at 2nd segment vertex
	                  t = 1.0;
	              }
	              // set our 'intersection' point to p2.
	              intersectPoint = lineEnd;
	              // Note: If you wanted the ACTUAL intersection point of where the projected lines would intersect if
	              // we were doing PointLineDistanceSquared, then intersectPoint.X would be (lineStart.X + (t * dx)) and intersectPoint.Y would be (lineStart.Y + (t * dy)).
	          }
	          else
	          {
	              // The projection of the point to the point on the segment that is perpendicular succeeded and the point
	              // is 'within' the bounds of the segment.  Set the intersection point as that projected point.
	              intersectPoint = new PointF((float)(lineStart.X + (t * dX)), (float)(lineStart.Y + (t * dY)));
	          }
	          // return the squared distance from p to the intersection point.  Note that we return the squared distance
	          // as an optimization because many times you just need to compare relative distances and the squared values
	          // works fine for that.  If you want the ACTUAL distance, just take the square root of this value.
	          double dpqX = point.X - intersectPoint.X;
	          double dpqY = point.Y - intersectPoint.Y;

	          distance = ((dpqX * dpqX) + (dpqY * dpqY));
	      }

	      return true;
	  }
*/
}
