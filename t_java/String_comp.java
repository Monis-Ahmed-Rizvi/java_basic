// string comparison and methods for it 
package t_jav;

import java.util.*;
import java.lang.*;


public class String_comp {

	public static void main(String[]args)
	{
		// String comparison
		String str1 = "a very fine morning ";
		String str2 = "hello world";
		
		// this method to compare strings is wrong 
		// as this just check if both the vars refer to the same objects 
		// this may work some time but will not work all the time 
		// as java complier check is str2 refers to the same thing as str1 it assigns it as referance  
		
		
		if(str1 == str2)
		{	
			System.out.println("Same");
		}
		
		
		
		// using .equals() is the correct method 
		
		
	    String name1 = "Monis ahmed" ;
	    String name2 = "Monis ahmed";
		
		if(name1.equals(name2))
		{
			
			System.out.println("Same");
		}
		
		// comparison methods 
		// compares which string comes first in the alphabetical order
	   
		if(0 == name1.compareTo(name2))
		{
			System.out.println("Same");
		}
		
		// the string1 comes first in alphabetical order then -1
		int diff =  str1.compareTo(str2);
		if(0 > diff)
		{
			System.out.println(str1+"comes first"+diff);
		}
		
		
		// if the string2 comes first int the alphabetical order then its a positive integer 
		
		String n1 = "abob";
		String n2 = "aalan";
		
		int diff1 = n1.compareTo(n2);
		if(0 < diff1)
		{
			System.out.println(n2+" comes first "+diff1);
		}
		
		
		
		
	}
	
	
}
