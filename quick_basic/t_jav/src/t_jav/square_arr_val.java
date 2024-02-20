// square all the value present in the array 
package t_jav;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class square_arr_val {

	
	public static void main(String[] args)
	{
		
		int[] a = {2,4,6,8,10,12,14};
		//int[] sq_ar = new int[a.length];
		for(int i =0;i<a.length;i++)
		{
		    a[i] =  (int) Math.pow(a[i],2);
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
}
