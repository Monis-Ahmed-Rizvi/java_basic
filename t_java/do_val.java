// using a do while loop check if the given input is a correct double if not keep repeating 
package t_jav;


import java.util.*;


public class do_val {

	
	public static void val()
	{
		
		Scanner sc = new Scanner(System.in);
		boolean flag;
		do {
			System.out.println("enter a double");
			if(sc.hasNextDouble())
			{
				flag = true;
			}
			else
			{
				flag = false;
				String word = sc.next();
				System.err.println(word+" is  not a double");
			}
		}while(!flag) ;
		
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		val();
		
		
	}
	
}
