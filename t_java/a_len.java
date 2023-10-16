// using the array.lenght in various diffrent ways


package t_jav;

import java.util.*;
import java.lang.*;

public class a_len {

	
	public static void print_p(int[] ar)
	{
		
		System.out.print("{");
		System.out.print(ar[0]);
		
		for(int i = 1;i<ar.length;i++)
		{
			
		  System.out.print(", "+ar[i]);
			
			
		}
		
		System.out.print("}");
		System.out.println("");
	}
	
	
	public static void main(String[] args)
	{
		int[] a = {9,8,76,5,2,34,56,75,4,3};
		int[] arr = new int[a.length];
		
		print_p(a);
		
		arr = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(arr));
	}
	
}
