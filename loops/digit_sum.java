// add digit of number
package loops;
import java.util.*;

public class digit_sum {

	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int total_num = 0;
		total_num = sc.nextInt();
		
		while(total_num>0) 
		{
		
		 int num = sc.nextInt();
		 int ctrl_num = num;
		 int sum = 0 ;
		 int rem =0;
		 for(int i =0;i<=ctrl_num;i++)
		 {
			rem =  num%10;
			num = num/10;
			sum += rem;
			if(rem == 0)
			{
				break;
			}
		 }
		
		 System.out.println(sum);
		 total_num--;
		
	}	
  } 
}
