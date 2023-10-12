// new line recursion
package t_jav;

import java.util.*;

public class new_line {

	public static void newLine(int n)
	{
		if(n>0)
		{
			System.out.println(" ");
			newLine(n-1);
		}
			
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Hello world");
		newLine(x);
		System.out.println("Hello world");	
	}
	
}
