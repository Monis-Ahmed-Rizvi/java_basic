// using a while loop find the sum of all the positive number input by users 

package t_jav;


import java.util.*;


public class add_positive {
	
	public static void main(String [] args)
	{
	  int x = -1;
	  int sum = 0;
		
	  Scanner sc = new Scanner(System.in);
	  while(x!=0)
	  {
		  
		  x = sc.nextInt();
		  if(x<=0)
		  {
			  continue;
		  }
		  else
		  {
			  sum += x;
		  }
		  System.out.println(sum);
		    
	  }
	  
	  System.out.println("Exit");
			
	}
		
}
