// check if a number is divisible by both 5 and 11 
package quick_basic;

import java.util.Scanner;

public class div_by_five {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.println("yes");
		}
		else
		{
			
			System.out.println("no");
			
		}
		
		
		
	}
	
}
