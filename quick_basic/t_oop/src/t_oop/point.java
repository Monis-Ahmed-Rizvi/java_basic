// usage of point class and point object

package t_oop;

import java.awt.*;
import java.util.*;
import java.math.*;

public class point {

	
	// passing object to a method
	
	public static void printPoint(Point obj)
	{
		
		System.out.println("("+obj.x+","+obj.y+")");
		
	}
	
	// distance function which takes point 
	// obj return distance between the point
	
	
	public static double distance(Point obj1,Point obj2)
	{
		
		int dx = obj2.x - obj1.x;
 		int dy = obj2.y - obj1.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public static void main(String[] args)
	{
		
		Point p_obj = new Point(3,4);
		// point class has toString method 
		//thus can be printed with println
		
		
		System.out.println(p_obj);
		
		// attribute accessed using dot operator 
		
		
		int p1 = p_obj.x;
		int p2 = p_obj.y;
		
		System.out.println(p1+" "+p2+" "+p_obj.x+" "+p_obj.y+" ");
		System.out.println(p_obj.x+p_obj.y);
		
		printPoint(p_obj);
		
		Point x = new Point(2,3);
		Point y = new Point(4,5);
		
		
		System.out.println(distance(x,y));
		
		
		
	}
	
	
}
