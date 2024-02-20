// implementing quadratic equation

package quick_basic;

import java.util.*;

public class quadratic {

	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a,b,c ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		 quad(a,b,c);
		
		
		
	}
	
	public static void quad(double a, double b,double c)
	{
		
		double discriminant;
		double r1,r2,imaginary;
		int options = 0;
		
		discriminant = (b*b) - (4*a*c);
		
		if(discriminant == 0)
		{
			options = 0;
		}
		else if(discriminant > 0)
		{
			options = 1;
		}
		else if(discriminant < 0)
		{
			options = 2;
		}
		
		
		switch(options)
		{
		
		   case 0:
			   r1 = r2 = -b/(2*a);
			   System.out.println(r1);
			   System.out.println(r2);
			   break;
		   case 1:
			   r1 = (-b + Math.sqrt(discriminant)) / (2*a);
			   r2 = (-b - Math.sqrt(discriminant)) / (2*a);
			   System.out.println(r1);
			   System.out.println(r2);
			   break;
		   case 2:
			   r1 = r2 = -b / (2 * a);
			   imaginary = Math.sqrt(-discriminant)/(2*a);
			   System.out.println(r1+" i"+imaginary);
			   System.out.println(r2+" i"+imaginary);
			   break;
			   
			   
			   
		
		}
		
		
		
		
		
		
	}
	
}
