// triangle pattern

package loops_basic;

import java.util.Scanner;

public class triangle_pat {

	
 public static void main()
 {
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number n");
	int x = sc.nextInt();
	
	for(int i=0;i<x;i++)
	{
		for(int j =0;j<i;j++)
		{
			
			System.out.println("*");
			
		}
		System.out.println();
		
	}
	
	 
	 
 }
	
	
}
