//  sum of all the element in the array 
package t_jav;

import java.util.Arrays;
import java.util.Scanner;


public class arr_sum {

	public static int sum(int[] arr)
	{
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum += arr[i];	
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int[] x  = {1,2,3,4,5,6,7,8,9,10};
		int res;
		res = sum(x);
		System.out.println("Sum of all the elments "+res);
	}
	
}
