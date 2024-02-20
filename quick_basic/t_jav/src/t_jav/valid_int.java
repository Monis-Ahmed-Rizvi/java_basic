package t_jav;

import java.util.*;


public class valid_int {

	public static void valid_int()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		if(!sc.hasNextFloat())
		{
			String word = sc.next();
			System.out.println(word +" not a number");
			return;
		}
		int x = sc.nextInt();
		System.out.println(x+" number ");
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		valid_int();
		
	}
	
}
