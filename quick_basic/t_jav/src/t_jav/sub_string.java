// substring functions
package t_jav;

import java.util.*;
import java.lang.*;


public class sub_string {

	
	public static void main(String[] args)
	{
		
		String name = "Monis ahmed";
		// sub string function
		// will print from specified beginning point to the end 
		System.out.println(name.substring(0));
		System.out.println(name.substring(5));
		
		// sub string specifying  beginning and the end 
		
		System.out.println(name.substring(5,8));
		
		
		// indexOf() used to find the index of a given character 
		String str = "banana";
		System.out.println(str.indexOf('a'));
		// can specify the starting point as well 
		System.out.println(str.indexOf('a',2));
		
		
		
		
		
		
		
		
		
		
	}
	
}
