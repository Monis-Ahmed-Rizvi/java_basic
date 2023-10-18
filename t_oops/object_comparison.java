// diffrence between == and equal method
// Difference between same object and different objects with same values 

package t_oop;
import t_oop.time;

import java.util.*;
import java.lang.*;
import java.math.*;

public class object_comparison {

	public static void main(String[] args)
	{
		time t1 = new time(9,30,0.0);
		// t1 t2 point to same object
		// t1 t2 ->[time obj 9:30:0.0]
		time t2 = t1;
		
		if(t1==t2)
		{
			System.out.println("same object");
		}
		
		
		System.out.println(t1.equals(t2));
		
		// different objects with same values
		
		time t3 = new time(9,30,0.0);
		
		// t3 -> [time obj 9:30:00] t1 ->[time obj 9:30:0.0]
		
		
		
		// will not trigger as they are diffrent object even if the values are same 
		if(t3==t1)
		{
			System.out.println("same object");
		}
		// this method also works similar to == operator 
		// it check if the reference point to same object 
		// we can overwrite this method
		System.out.println(t1.equals(t3));
		
		
		
	}

	
}
