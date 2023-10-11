// log fucntion 

package t_jav;

import java.util.*;
import java.lang.*;
import java.math.*;



public class log {

	public static double printlog(double x)
	{
		
		if(x<0.0)
		{
			System.err.println("Should be positive");
			return 0.0;
			
		}
		else
		{
			return Math.log(x);
		}
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double num =  sc.nextDouble();
		double res = printlog(num);
		System.out.println(res);
		
	}
	
}
