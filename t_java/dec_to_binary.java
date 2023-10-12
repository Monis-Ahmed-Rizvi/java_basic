// decimal to binry
package t_jav;

import java.util.*;

public class dec_to_binary {

	public static void dec_to_bin(int n)
	{
		
	  if(n>0)
	  {
		  dec_to_bin(n/2);
		  System.out.print(n%2);
		  
	  }
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		dec_to_bin(x);
	}
	
}
