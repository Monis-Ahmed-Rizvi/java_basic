// Generating random number and storing in array
// isRange() find the number within the given range 

package t_jav;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class rand_arr {
	
	// takes the size of arrays to be generated 
	
	public static int[] rand_ar(int size)
	{
		Random rand = new Random();
		int arr[] = new int[size];
		for(int i =0;i<arr.length;i++)
		{
			// generating random numbers within a given range 
			arr[i] = rand.nextInt(100);
		}
		
		return arr;
	}
	
	
	// takes and array , high value and low value (range) 
	//display all number that fall in that range
	// returns the total count of number thats fall with in that range  
	
	public static int inRange(int arr[],int low,int high)
	{
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			if((arr[i]>= low) && (arr[i]<high))
			{
				//System.out.printf("%4d",arr[i]);
				count++;
			}
		
		}
		//System.out.println("");
		return count;
		
	}
	
	
	// histogram based on the previous function inRange()
	// takes the size of the array
	// call inrange() function to find how many times a given number occurs in the range
	// stores the result in  array and return 
	public static int[] hist(int size,int[] scores)
	{
		
		int[] res = new int[100];
		for(int i =0;i<res.length;i++)
		{
			res[i] = inRange(scores,i,i+1);
		}
		
		
		return res;
	}
	
	// optimized version of histogram
	
	public static int[] op_hist(int[] arr)
	{
		int[] count = new int[100] ;
		for(int i =0;i<arr.length;i++)
		{
			int index = arr[i];
			count[index]++;
			
		}
		
		return count;
		
	}
	
	// interpret result from the histogram in a better way
 	
	public static void res_intp(int[] res)
	{
		
		for(int i =0;i<res.length;i++)
		{
			
			if(res[i] > 0)
			{
				System.out.println(i+" : "+res[i]);
			}
			
		}
		
		
	}
	
	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array to be genrated ");
        int x = sc.nextInt();
        int[] scores = rand_ar(x);
        System.out.println(Arrays.toString(scores));
        int res = 0;
        res = inRange(scores,30,50);
        // System.out.println(res);
        
        int[] hist_res = hist(x,scores);
        //System.out.println(Arrays.toString(hist_res));
        
        int[] hist_op_res = op_hist(scores);
        //System.out.println(Arrays.toString(hist_op_res));
        
        res_intp(hist_op_res);
    }
 



}
