// find the maximum value of among 3 numbers 

package quick_basic;

import java.util.Scanner;

public class max_of_three {

	public static void main(String [] args)
	{
		
		int num1, num2,num3 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 3 numbers");
		
		num1 =  sc.nextInt();
		num2 =  sc.nextInt();
		num3 =  sc.nextInt();
		
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is the max");
			
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is the max");
			
		}
		else
		{
			System.out.println(num3+" is the max");
		}
		
		
		
		
	}
	
	
}
