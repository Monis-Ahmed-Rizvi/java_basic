// creating a array 
// accessing elements 
// accessing in loops
package t_jav;

import java.util.*;

public class ar {

	public static void main(String[] args)
	{
		int[] ar = new int[4];
		int[] ar1 = {1,2,3,4};
		
		ar[0] = 7;
		ar[1] = ar[0] * 2;
		ar[2] = -60;
		ar[3]++; 		
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
		
		// trying to print directly with println()
		System.out.println("");
		System.out.println(ar);
		// converting array to string  print directly 
		
		System.out.println(Arrays.toString(ar));
		
		// printing in a particular format 
		
		System.out.print("{" + ar1[0]);
		for(int i =1;i<ar1.length;i++)
		{
			System.out.print(", "+ar1[i]);
		}
		
		System.out.print("}");
		
	}
	
	
}
