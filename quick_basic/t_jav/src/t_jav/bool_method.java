// check if a given number is single digit or not  

package t_jav;

import java.util.*;


public class bool_method {

	public static boolean isSingle(int num)
	{	
	   return num < 10 && num > -10;	
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int z = sc.nextInt();
		
		//System.out.println(!isSingle(11));
		//System.out.println(isSingle(12));
		//System.out.println(isSingle(2));
		// using boolean methods to make decisions
		
		if(isSingle(z))
		{
			System.out.println("num is single digit");
		}
		else
		{
			System.out.println("num is not single digit");
		}
	}
	
}