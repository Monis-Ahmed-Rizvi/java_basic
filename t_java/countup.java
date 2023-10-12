package t_jav;

import java.util.Scanner;

public class countup {

	public static void count(int n)
	{
		
	   if(n==0)
	   {
		   System.out.println("The end");
	   }
	   else
	   {
		   count(n-1);
		   System.out.println(n);
		   
		   
	   }
		
		
	}
	
	
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		count(n);
		
	}
	
	
}
