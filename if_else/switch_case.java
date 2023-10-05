// sample program for the use of switch case 

package quick_basic;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		switch(num)
		{
		 case 1:
			System.out.println("day 1");
            break;
            
          default:
        	  System.out.println("any day");
		}
			
	
		
		
	}
	
	
}
