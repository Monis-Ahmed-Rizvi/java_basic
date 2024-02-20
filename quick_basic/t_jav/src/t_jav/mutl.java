package t_jav;

import java.util.*;

public class mutl {

	public static void mult_row(int n,int col)
	{
		int i = 1;
		while(i<=col)
		{
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
			
		System.out.println("");
	}
	
	
	public static void contol(int i,int col) 
	{
	
		int n = 1;
		while(n<=i)
		{
			mult_row(n,n);
			n+=1;
		}
	}
	
	
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row");
		int x = sc.nextInt();
		System.out.println("Enter col");
		int col = sc.nextInt();
		//mult_row(x,10);
		contol(x,col);
	}
	
}
