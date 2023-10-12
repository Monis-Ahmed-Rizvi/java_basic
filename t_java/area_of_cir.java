package t_jav;

import java.util.*;
public class area_of_cir {
	
	public static double cal(double r)
	{
		return Math.PI * r * r;
		
	}
	
	public static double dist(double x1, double y1,double x2,double y2)
	{
		double dx = x2-x1;
		double dy = y2-y1;
		
		double square_dist = dx * dx + dy * dy;
		double res = Math.sqrt(square_dist);
		return res;
	}
	
	
	public static double calculateArea(double xc, double yc, double xp, double yp) {
	return cal(dist(xc, yc, xp, yp));
	}
	
	
	
	public static void main(String[] args)
	{
		
		double y = calculateArea(1.0, 2.0, 4.0, 6.0);
		System.out.println(y);
	}
	

}
