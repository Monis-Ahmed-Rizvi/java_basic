// simple calculator using switch 
package quick_basic;

import java.util.Scanner;

public class cal {

	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 ");
		int num1 = sc.nextInt();
		System.out.println("enter number 1 ");
		int num2 = sc.nextInt();
		
		
		System.out.println("select a option");
		
		System.out.println("1 addition");
		System.out.println("2 subtraction");
		System.out.println("3 multiplication");
		System.out.println("4 division");
		int op = sc.nextInt();
		switch(op)
		{
		
			case 1:
				System.out.println(num1+num2);
				break;

			case 2:
				System.out.println(num1-num2);
				break;

			case 3:
				System.out.println(num1*num2);
				break;

			case 4:
				System.out.println(num1/num2);
				break;

			default:
				System.out.println("Wrong option selected ");
				break;
			
		
		
		}
		
		
			
		
	}
	
}
