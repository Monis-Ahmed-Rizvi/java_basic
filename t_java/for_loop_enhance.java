// demo for enhanced for loop
package t_jav;

import java.util.*;
import java.lang.*;


public class for_loop_enhance {

	public static void main(String[] args)
	{
		
		int[] arr = {2,34,56,78,87,6,5,4,3};
		for(int val:arr)
		{
			System.out.printf("%4d",val);
		}
		
		int[] count = new int[100];
		System.out.println("");
		for(int val:arr)
		{
			
			count[val]++;
		}
		
		System.out.println(Arrays.toString(count));
		
	}
	
	
	
}
