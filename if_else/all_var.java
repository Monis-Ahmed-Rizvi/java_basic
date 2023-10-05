// input all commonly used variables 
// out all commonly used variables

package quick_basic;

import java.util.Scanner;

public class all_var {

	
	public static void main(String[] args)
	{
		
		int num1;
		float num2;
		double num3;
		char character;
		boolean bool;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int");
		num1 = sc.nextInt();
		System.out.println("Enter float");
		num2 = sc.nextFloat();
		System.out.println("Enter double");
		num3 = sc.nextDouble();
		System.out.println("Enter chacter");
		character = sc.next().charAt(0);
		System.out.println("enter a boolean");
		bool = sc.nextBoolean();
		System.out.println("enter a String");
		str = sc.next();
		
		
		System.out.println("int ->"+num1);
		System.out.println("float ->"+num2);
		System.out.println("double ->"+num3);
		System.out.println("char  ->"+character);
		System.out.println("bool  ->"+bool);
		System.out.println("String   ->"+str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
