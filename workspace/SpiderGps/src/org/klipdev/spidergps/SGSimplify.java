	/**

	 * ##library.name##
	 * ##library.sentence##
	 * ##library.url##
	 *
	 * Copyright ##copyright## ##author##
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 * 
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 * Lesser General Public License for more details.
	 * 
	 * You should have received a copy of the GNU Lesser General
	 * Public License along with this library; if not, write to the
	 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
	 * Boston, MA  02111-1307  USA
	 * 
	 * @author      ##author##
	 * @modified    ##date##
	 * @version     ##library.prettyVersion## (##library.version##)
	 */

package org.klipdev.spidergps;


import java.util.ArrayList;
import java.util.Stack;

public class SGSimplify {
	// Important note: 'tolerance' is same unit as points coordinates !!
	public static ArrayList<SGPosition> simplify(ArrayList<SGPosition> points, double tolerance) {
		double sqTolerance = tolerance * tolerance;

		return simplifyDouglasPeucker(points, sqTolerance);
	}

	public static ArrayList<SGPosition> simplify(ArrayList<SGPosition> points, double tolerance, boolean highestQuality) {
		double sqTolerance = tolerance * tolerance;

		if (!highestQuality)
			points = simplifyRadialDistance(points, sqTolerance);

		points = simplifyDouglasPeucker(points, sqTolerance);

		return points;
	}

	// distance-based simplification
	public static ArrayList<SGPosition> simplifyRadialDistance(ArrayList<SGPosition> points, double sqTolerance) {
		int len = points.size();

		SGPosition point = null;
		SGPosition prevPoint = points.get(0);

		ArrayList<SGPosition> newPoints = new ArrayList<SGPosition>();
		newPoints.add(prevPoint);

		for (int i = 1; i < len; i++) {
			point = points.get(i);

			if (getSquareDistance(point, prevPoint) > sqTolerance) {
				newPoints.add(point);
				prevPoint = point;
			}
		}

		if (!prevPoint.equals(point)) {
			newPoints.add(point);
		}

		return newPoints;
	}

	// simplification using optimized Douglas-Peucker algorithm with no recursion
	public static ArrayList<SGPosition> simplifyDouglasPeucker(ArrayList<SGPosition> points, double sqTolerance) {
		int len = points.size();

		Integer[] markers = new Integer[len];

		Integer first = 0;
		Integer last = len - 1;

		double maxSqDist;
		double sqDist;
		int index = 0;

		Stack<Integer> firstStack = new Stack<Integer>();
		Stack<Integer> lastStack = new Stack<Integer>();
		ArrayList<SGPosition> newPoints = new ArrayList<SGPosition>();


		markers[first] = markers[last] = 1;

		SGPosition p, p1, p2;
		p1 = points.get(first);
		p2 = points.get(last);

		while (last != null) {
			maxSqDist = 0;

			for (int i = first + 1; i < last; i++) {
				p = points.get(i);
				sqDist = getSquareSegmentDistance( p, p1, p2 );

				if (sqDist > maxSqDist) {
					index = i;
					maxSqDist = sqDist;
				}
			}
			
			if (maxSqDist > sqTolerance) {
				markers[index] = 1;

				firstStack.push(first);
				lastStack.push(index);

				firstStack.push(index);
				lastStack.push(last);
			}

			if (firstStack.size() > 0) {
				first = firstStack.pop();
				p1 = points.get(first);
			}
			else {
				first = null;
			}

			if (lastStack.size() > 0) {
				last = lastStack.pop();
				p2 = points.get(last);
			}
			else {
				last = null;
			}
		}

		for (int i = 0; i < len; i++) {
			if (markers[i] != null)
				newPoints.add(points.get(i) );
		}

		return newPoints;
	}

	public static double getSquareDistance(SGPosition p1, SGPosition p2) {
		double dx = p1.longitude - p2.longitude;
		double dy = p1.latitude - p2.latitude;

		// Ignore elevation
//			double dz = p1.elevation - p2.elevation;
		return dx * dx + dy * dy; // + dz * dz;
	}

	// square distance from a point to a segment, ignore elevation
	public static double getSquareSegmentDistance(SGPosition p, SGPosition p1, SGPosition p2) {
		double x = p1.longitude;
		double y = p1.latitude;
		// double z = p1.elevation;

		double dx = p2.longitude - x;
		double dy = p2.latitude - y;
		// double dz = p2.elevation - z;

		double t;

		if (dx != 0 || dy != 0 /*|| dz != 0*/) {
			t = ((p.longitude - x) * dx + (p.latitude - y) * dy) /*+ (p.elevation - z) * dz*/ / (dx * dx + dy * dy /*+ dz * dz*/);

			if (t > 1) {
				x = p2.longitude;
				y = p2.latitude;
//					z = p2.elevation;

			} else if (t > 0) {
				x += dx * t;
				y += dy * t;
//					z += dz * t;
			}
		}

		dx = p.longitude - x;
		dy = p.latitude - y;
//			dz = p.elevation - z;

		return dx * dx + dy * dy; // + dz * dz;
	}
}
