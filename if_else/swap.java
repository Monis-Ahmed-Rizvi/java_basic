// swap two values without using third variable 

package quick_basic;

import java.util.Scanner;

public class swap {

	public static void main(String []args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println("before swap "+num1+" : "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After  swap "+num1+" : "+num2);
		
		
		
		
	}
	
	
}
