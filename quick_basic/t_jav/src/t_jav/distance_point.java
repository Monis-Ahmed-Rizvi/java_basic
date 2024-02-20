// find distance between two points given by x,y coordinate

package t_jav;

import java.util.*;

public class distance_point {

	
	public static double dist(double x1, double y1,double x2,double y2)
	{
		double dx = x2-x1;
		double dy = y2-y1;
		
		double square_dist = dx * dx + dy * dy;
		double res = Math.sqrt(square_dist);
		return res;
	}
	
	
	public static void main(String[] args)
	{
		
		double res = dist(2,3,6,7);
		System.out.println(res);
		
	}
	
	
}
