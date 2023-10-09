// multiplication table of the given number 

package loops_basic;

import java.util.Scanner;

public class mutl_table {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for multiplication table");
		
		int num  = sc.nextInt();
		
		for(int i =1;i<=10;i++)
		{
			
			System.out.println(num+"*"+i+"="+(num*i));
			
			
		}
		
		
		
		
		
	}
	
	
}
