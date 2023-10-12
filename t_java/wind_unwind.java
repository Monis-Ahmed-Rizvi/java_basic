// better understanding winding and unwinding of recursion in java 

package t_jav;

import java.util.*;

public class wind_unwind {

	public static void count(int n)
	{
		if(n==0)
		{
			System.out.println("End");
			System.out.println("UnWinding");
		}
		else
		{
			System.out.println(n);
			count(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		
		count(x);
		
	}
	
	
	
}
