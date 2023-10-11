// recursion based timer / countdown

package t_jav;

import java.util.*;

public class countdown_rec {

	public static void countdown(int n)
	{
		if(n == 0)
		{
			System.out.println("Blast off !");
		}
		else
		{   
			System.out.println(n);
			countdown(n-1);
		}
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		countdown(x);
	}
	
	
}
