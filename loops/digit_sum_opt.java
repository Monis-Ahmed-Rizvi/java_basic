// optimized version of sum of digits in a number 
package loops;
import java.util.*;
public class digit_sum_opt {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter then how many numbers sum you want to find");
		int num_n = sc.nextInt();
		while(num_n>0)
		{
			int sum = 0;
			System.out.println("input num");
			int num = sc.nextInt();
			while(num>0)
			{
				sum += num%10;
				num /= 10; 
			}
			
			System.out.println(sum);
			num_n --;
		}
	}
	
}
