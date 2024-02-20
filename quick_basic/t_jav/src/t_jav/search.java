// implementation of linear search 
// function takes an array a element and return the index where its found 
package t_jav;


import java.util.Arrays;
import java.util.Scanner;


public class search {

	public static int search(int[] arr,int n)
	{
		
		for(int i = 0;i<arr.length;i++)
		{
			
			if(arr[i]==n)
			{
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		int[] arr = {9,8,7,65,4,34,5,6,73};
	    Scanner sc  =  new Scanner(System.in);
	    System.out.println("Enter the number to search");
	    int num = sc.nextInt();
	    int res;
	    
	    res = search(arr,num);
	    
	    if(res == -1)
	    {
	    	System.out.println("Element not found in the array");
	    }
	    else
	    {
	    	System.out.println("Element found on the index "+res);
	    }
	    
	   
	}
	
	
}
