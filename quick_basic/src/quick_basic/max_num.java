// find the max number using ternary operator 

package quick_basic;

import java.util.Scanner;

public class max_num {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number one");
			int num1 = sc.nextInt();
			System.out.println("enter the number 2");
			int num2 = sc.nextInt();
			
			
			int res = (num1 > num2) ? num1 : num2;
			
			System.out.println("give numbers are " +num1 +" " +num2+ " the bigger number is "+res);
			
			
			
			
			
		}
		

	
}
