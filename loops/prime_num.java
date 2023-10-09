// check if a given number is prime number or not 

package loops_basic;

import java.util.*;
import java.lang.*;

public class prime_num {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean flag = true;
		for(int i =2;i<num;i++)
		{
			if(i%num==0)
			{
				flag = false;
				break;
			}	
		}
		
		if(flag == true)
		{
			System.out.println("prime number");
		}
		else if(flag == false)
		{
			System.out.println("not a prime number ");
		}
		
		
		
				
		
	}
	
	
}
