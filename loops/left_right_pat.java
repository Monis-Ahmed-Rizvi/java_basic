// right and left triangle pattern

package loops;

import java.util.Scanner;

public class left_right_pat {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		for(int i =0;i<=num;i++)
		{
		    for(int j = 0;j<i;j++)
			{
				System.out.print("*");
			}
			if(i > 0)
			{
				
				for(int l=i;l<num;l++)
				{
					System.out.print("#");
				}	        
				for(int l=i;l<num;l++)
				{
					System.out.print("#");
				}
				
			}
		
	        
			 for(int j = 0;j<i;j++)
			{
				System.out.print("*");
			}
				
			
			
		    if(i > 0)
		    {
			 System.out.println("");
		    }
		}
	}
	
	
}
