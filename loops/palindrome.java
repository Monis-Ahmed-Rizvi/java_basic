import java.util.*;

public class palindrome{
	public static int rev(int num)
	{


        int tran = 0;
        int rev_num = 0;
        while(num>0)
        {

           tran = num%10;
           rev_num = (rev_num * 10) + tran;
           num = num/10;

        }
        return rev_num;

	}



	public static void main(String[] args)
	{


        Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
        int num = sc.nextInt();
        int rev_num = rev(num);
        int x , x_rev = 0;
        int flag =1;
        
        while(rev_num!=0)
        {
           x = num%10;
           x_rev = rev_num%10;
           if(x!=x_rev)
           {
           	flag = 0;
           	break;
           }

           rev_num = rev_num/10;
           num = num/10;


        }



        if(flag == 0)
        {
        	System.out.println("not palindrom");
        }
        else if(flag == 1)
        {
        	System.out.println("palindrome");
        }




	}
}