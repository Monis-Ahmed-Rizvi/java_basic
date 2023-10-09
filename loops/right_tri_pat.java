// right side side triangle

package loops;
import java.util.Scanner;

public class right_tri_pat {

	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i =0;i<num;i++)
		{
			for(int j=i;j<num-1;j++)
			{
				System.out.print(" ");
			}
			
			
			for(int k = 0;k<i+1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
	}
	
	
}
