package t_jav;

import java.util.Scanner;

public class w_countdown {
    
	public static void count(int n)
	{
		while(n>0)
		{
			System.out.println(n);
			n-=1;
		}
		System.out.println("Blast off");
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		count(x);
		
		
		
	}
	
	
}
