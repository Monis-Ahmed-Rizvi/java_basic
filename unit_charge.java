// charge of unit of electricity
package quick_basic;
import java.util.Scanner;
public class unit_charge {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the amount of electricity ");
		int unit = sc.nextInt();
		double amnt =0;
		if(unit<=50)
		{
			amnt = unit * 0.50;
			
		}
		else if(unit<=150)
		{
			amnt = 25 + ((unit-50) * 0.75); 
		}
		else if(unit<=250)
		{
			amnt = 100 + ((unit-150) * 1.20);
		}
		else
		{
			amnt = 220 + ((unit-250) * 1.50); 
		}
		double ans = amnt + amnt * 0.20;
		
		System.out.println(ans);
		
	}
	
}
