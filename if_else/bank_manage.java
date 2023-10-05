//You are bank manager and you are assigned to tasks.
//1. Add the mentioned amount to the account
//2. Subtract the mentioned amount to the account
package quick_basic;
import java.util.Scanner;
public class bank_manage {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		double balance;
		double amnt;
		int type;
		
		System.out.println("Enter current the balance");
		balance = sc.nextDouble();
		
		
		System.out.println("enter operation 1 to add 2 to subtract");
		type = sc.nextInt();
		
		
		System.out.println("enter the amount  ");
		amnt = sc.nextDouble();
		
		
		if(type==1)
		{
			balance += amnt;
			System.out.println(balance);
		}
		else if(type == 2)
		{
			if(amnt<balance)
			{
				balance-=amnt;
				System.out.println(balance);
			}
			else if(amnt>balance)
			{
				System.out.println("insuficient balance  ");
			}
			
		}
		else
		{
			System.out.println("invalid operations is selected ");
		}
		
		
		
	}

}
