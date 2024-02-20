// validating double input

package t_jav;
import t_jav.log;
import java.util.*;

public class valid_input {
     
	public static void doublescan(log log_obj)
	{
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println(log_obj.printlog(x));
		
	}
	
	public static void opt_scan(log log_obj)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double");
		if(!sc.hasNextDouble())
		{
			String word = sc.next();
			System.out.println(word+" is not a Double");
			return;
		}
		else
		{
			double x = sc.nextDouble();
			System.out.println(log_obj.printlog(x));
		}
		
		
	}
	
	
	public static void main(String[]args)
	{
		
		log log_obj = new log();
		//doublescan(log_obj);
		opt_scan(log_obj);
		
	}
	
}
