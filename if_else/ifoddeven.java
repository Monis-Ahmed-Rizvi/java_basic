// check if a number is odd or even 



package quick_basic;
import java.util.Scanner ;


public class ifoddeven {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x  = sc.nextInt();
		
		if(x % 2== 0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
		
	}
	
}
