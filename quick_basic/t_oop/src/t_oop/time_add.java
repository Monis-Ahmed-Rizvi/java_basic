// using time add function
package t_oop;

import t_oop.time;
import java.util.*;
import java.lang.*;
import java.math.*;



public class time_add {

	public static void main(String [] args)
	{
		
		time t1 = new time(21,30,0.0);
		time t2 = new time(0,31,0.0);
		
		System.out.println(t1.add(t2));
		
		
	}
	
}
