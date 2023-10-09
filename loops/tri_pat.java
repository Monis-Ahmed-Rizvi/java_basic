// triangle pattern

package loops;

import java.util.Scanner;

public class tri_pat {

	
 public static void main(String[] args)
 {
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number n");
	int x = sc.nextInt();
	
	for(int i=1;i<=x;i++)
	{
		for(int j =0;j<i;j++)
		{
			
			System.out.print("*");
			
		}
		System.out.println();
		
		
	}
	
	 
	 
 }
	
	
}
