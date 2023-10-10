import java.util.*;

public class rev_num{
	public static void main (String[] args)
	{

       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int cp_x = x;
       int rev_n = 0;
       int tran = 0;
       while(x>0)
       {

          tran = x%10;
          rev_n = (rev_n * 10) + tran;
          x= x/10;

       }
       System.out.println(rev_n);

	}
}