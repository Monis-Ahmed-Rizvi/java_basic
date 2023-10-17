// using the class time 
package t_oop;

import t_oop.time;
import java.util.*;
import java.lang.*;

public class time_client {

	public static void display_time(time obj)
	{
		// using getter methods made in  time class
		System.out.println(obj.getHour()+":"+obj.getMinute()+": "+obj.getSecond());
	}
	
	

	
	public static void main(String[] args)
	{
		
	  time t1 = new time();
	  // using the constructor in the time class 
	  
	  time t2 = new time(12,45,34);
	  
	  display_time(t1);
	  display_time(t2);
	  
	  // using the the setter method
	  
	  t1.setHour(7);
	  t1.setMinute(30);
	  t1.setSecond(30);
	  
	  display_time(t1);
	  // using a static method created in time class 
	  time.printTime(t2);
	  
	  
	  // using toString method 
	  
	  System.out.println("t1"+t1);
	  
	}
	
	
}
