// sting methods and properties

package t_jav;

import java.util.Scanner;
import java.lang.*;

public class string_ops {

	
	public static void main(String[] args)
	{
		
		// Strings in java are immutable
		
		String name = "Monis ar";
		name = name.toUpperCase();
		String nameUp = name.toLowerCase();
		System.out.println(nameUp);
		System.out.println(name);
		
		// replace method
		
		name = name.replace("AR", "Ahmed Rizvi");
		System.out.println(name);
		
		// String traversal 
		
		for(int i =0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
		
		// string traversal enhanced loop
		
		System.out.println();
		
		for(char val:name.toCharArray())
		{
			System.out.println(val);
		}
		
		
		// finding the last element of a string
		// String are indexed from 0 but length is given in 1 index 
		// thus reduce one 
		
		char last = name.charAt(name.length() - 1);
		System.out.println("last element : "+last);
		
	}
	
	
}
