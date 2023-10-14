// log table using while loop

package t_jav;

import java.util.*;

public class log_w {

	public static void Wlog (int n)
	{ 
		int i = 1;
		while(i<n)
		{
			double x = (double) i;
			System.out.println(x+" "+Math.log(x));
			i += 1;
		}
	}
	
	
	public static void  Wlog_base2(int n)
	{
		int i = 1;
		while(i<n)
		{
			double x = (double) i;
			System.out.println(x+"  "+Math.log(x)/Math.log(2));
			i += 1; // arithmetic sequnce
		}
		
	}
	
	
	public static void Wlog_geo_seq(int num)
	{
		
		int i = 1;
		while(i<num)
		{
		
		  double x = (double) i;
		  System.out.println(x+" "+Math.log(x)/Math.log(2));
		  i = i * 2; // geometric progression;
			
		}
		
		
	}
	
	public static void main (String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a num");
		int x = sc.nextInt();
		Wlog(x);
		System.out.println("");
		System.out.println("Base 2 log");
		System.out.println("");
		Wlog_base2(x);
		System.out.println("");
		System.out.println("geometric progression");
		Wlog_geo_seq(x);
		
		
	}
	
	
}
