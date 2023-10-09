package loops;

import java.util.Scanner;

public class diamond {

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
					System.out.print(" ");
				}	        
				for(int l=i;l<num;l++)
				{
					System.out.print(" ");
				}
				
			}
	        
			 for(int j = 0;j<i;j++)
			{
				System.out.print("*");
			}
				
		    if(i>0)
		    {
			  System.out.println("");
		    }
		}
	
	
}
}
