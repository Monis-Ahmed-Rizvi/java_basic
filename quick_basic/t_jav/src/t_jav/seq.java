// Generating a terminating sequence 
package t_jav;

import java.util.*;

public class seq {

	public static void seq(int num)
	{
		while(num!=1)
		{
			System.out.println(num);
			if(num%2==0)
			{
				num = num/2;
			}
			else {
				num = 3 * num + 1;
			}
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		seq(x);
		
		
	}
	
	
}
