package loops;

import java.util.Scanner;

public class pal_square {
	
	public static void main(String[]args)
	{
		
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		int x =1;
		int inside_flag = 0;
		
		for(int i =1;i<=num;i++)
		{
			
			for(int j =i;j<=num;j++)
			{
				System.out.print("*");
			}
			
			int count = 0;
			int inside_x = x;
			//int inside_x_reduce = x;
			for(int k = 1;k<i+1;k++)
			{
				
				if(count ==0)
				{
					 System.out.print(x);
				}
				else
				{   inside_x +=1; 
				    System.out.print(inside_x);
				}
				count++;
			}
			
			int inside_x_reduce = inside_x;
			
			for(int l = 1;l<i;l++)
			{
				
				if(inside_flag==0)
				{
					 break;
				}
				else
				{   //System.out.print("in");
					inside_x_reduce -=1; 
				    System.out.print(inside_x_reduce);
				}
				
			}
			
			inside_flag = 1;

			for(int u =i;u<=num;u++)
			{
				System.out.print("*");
			}
			
			
			x++;
			System.out.println();
			
		}
		
		
	}
	

}
