// down ward left right 

package loops;

import java.util.Scanner;

public class down_right_left {

	
	public static void main(String[] args)
	{
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		
		for(int i =0;i<num;i++)
		{
			
			for(int j =i;j<num;j++)
			{
				System.out.print("*");
			}
			
			
			for(int k =0;k<i;k++)
			{
				System.out.print(" ");
				
			}
			
			for(int k =0;k<i;k++)
			{
				System.out.print(" ");
				
			}
			
			
			
			for(int j =i;j<num;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}
	
	
}
