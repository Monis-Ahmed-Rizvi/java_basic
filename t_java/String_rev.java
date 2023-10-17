// reverse a string 

package t_jav;

import java.util.*;
import java.lang.*;

public class String_rev {

	
	public static String rev(String str)
	{
		
		String res = "";
		for(int i = str.length() -1;i>=0;i--)
		{
			
			res = res + str.charAt(i);
			
		}
		
		return res;
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str1 = sc.nextLine();
		String res = rev(str1);
		System.out.println(res);
	}
	
	
	
}
