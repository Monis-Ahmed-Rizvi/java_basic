// downward number triangle 
package loops;

import java.util.Scanner;

public class num_tri {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int num = sc.nextInt();
		
		for(int i =num;i>=1;i--)
		{
			
			
			for(int j = 1;j<=i;j++)
			{
				
				System.out.print(j);
				
			}
			
			
			System.out.println("");
			
			
			
		}
		
		
		
	}
	
	
}
