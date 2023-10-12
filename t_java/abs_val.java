// absolute value

package t_jav;

import java.util.*;

public class abs_val {

	public static double abs(double num)
	{
		
		if(num<0)
		{
			
			return -num;
		}
		else
		{
			return num;
		}
		
		// dead code 
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		System.out.println(abs(num));
		
		
	}
	
}
