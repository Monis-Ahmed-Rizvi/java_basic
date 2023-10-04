// check is the given year in a leap year 

package quick_basic;

import java.util.*;

public class leap {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int year = sc.nextInt();
		if( year %400==0)
		{
		  System.out.println("Leap year");	
		}
		else if( year % 100 == 0 )
		{
			System.out.println("Not a leap year");
			
		}
		else if(year % 4 == 0)
		{
			
			System.out.println("Leap year ");
			
		}
		else
		{
			System.out.println("Not leap year ");
		}
		
		
	}
	
	
	
}
