// Different string method and manipulation 
package t_jav;
import java.util.*;
import java.lang.*;

public class strMethod {
	
	public static void main(String[] args)
    {
    	String str1 = "Monis";
    	
    	// works similar to array indexing 
    	
    	char char1 = str1.charAt(0);
    	
    	// you can compare characters 
    	
    	if(char1 == str1.charAt(0))
    	{
    		System.out.println("Same");
    		
    	}
    	
    	// incrementing and decrementing char 
    	// printing A to Z 
    	
    	System.out.println("Alphabets");
    	
    	for(char let = 'A';let<='Z';let++ )
    	{
    		System.out.printf("%2c",let);
    	}
    	
    	
    	
    }
}
