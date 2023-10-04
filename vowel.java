// check if a character a vowel or not 
package quick_basic;

import java.util.Scanner;

public class vowel {

	public static int is_vowel(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
		{
			return 1;
		}
		return 0;
	}
	
	
	public static void main(String[] args)
	{
		
		char a ;
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		int x = is_vowel(a);
		if(x==1)
		{
			System.out.println("vowel");
		}
		else if(x==0)
		{
			System.out.println("not vowel");
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	
}
