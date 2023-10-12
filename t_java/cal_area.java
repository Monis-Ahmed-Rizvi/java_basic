// pi*r^2
package t_jav;

import java.util.*;

public class cal_area {

	public static double cal(double r)
	{
		return Math.PI * r * r;
		
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println(cal(r));
		
		
	}
	
}
