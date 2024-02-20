// printing table of 2 with infinite loop , break & continue

package quick_basic;

import java.util.Scanner;

public class infinite_ctrl {

	public static void main(String[] args)
	{
		int i = 1;
		for(;;i++)
		{
			if(i>20)
			{
				break;
			}
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}
		
	}
	
	
}
