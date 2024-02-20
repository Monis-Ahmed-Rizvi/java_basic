// creating a alias and a real copy 

package t_jav;


import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class copy_arr {

	public static void main(String[] args)
	{
		
		int[] arr = new int[5];
		// alias
		int[] d = arr;
		
		arr[0] = (3*1);
		arr[2] = 3*arr[0];
		arr[3] = 3*arr[2];
		arr[1] = 3*arr[3];
		
		
		
		
	    System.out.println(Arrays.toString(arr));
	    // change in arr reflect in d
	    System.out.println(Arrays.toString(d));
	    
	    // change in d reflect in arr 
	    
	    d[3] = 0;
	    
	    System.out.println(Arrays.toString(arr));
		
		
		// creating a non alias individual copy 
	    
	    int[] arr_cp = new int[5];
	    int[] b_cp = new int[arr_cp.length];
	    
	    // filling arr_cp with random number 
	    
	    for(int i =0;i<arr_cp.length;i++)
	    {
	    	arr_cp[i] = (int) Math.PI * i;
	    }
	    
	    
	    System.out.println("first array "+ Arrays.toString(arr_cp));
	    // copying values from the first array to the second 
	    
	    
	    for(int i =0;i<arr_cp.length;i++)
	    {
	    	b_cp[i] = arr_cp[i];	
	    }
	    
	    
	    System.out.println("second array "+ Arrays.toString(b_cp));
	    
	    // making changes to one 
	    
	    arr_cp[0] = 100;
	    
	    System.out.println("first array "+ Arrays.toString(arr_cp));
	    System.out.println("Second array"+ Arrays.toString(b_cp));
	    
	    
		// copying using a function;
	    
	    Scanner sc =  new Scanner(System.in);
	    System.out.println("Enter the size of the array ");
	    int x = sc.nextInt();
		int[] ar_cpf = new int[x];
		int[] b_cpf = new int[x];
		
		
		for(int i = 0;i<ar_cpf.length;i++)
		{
			ar_cpf[i] = (int) Math.PI+i;
			
		}
	    
		
		
		System.out.println(Arrays.toString(ar_cpf));
		
		// copying using inbuilt function
		
		b_cpf = Arrays.copyOf(ar_cpf, x);
		
		
       // making changes to one 
	    
	    ar_cpf[0] = 100;
	    
	    System.out.println("first array "+ Arrays.toString(ar_cpf));
	    System.out.println("Second array"+ Arrays.toString(b_cpf));
	    
		
		
		
	}
	
	
	
}
