//Create an operation calculator for 2 numbers a and b, that should follow the below mapping:
//1-> find the minimum between 2 numbers, print the least number as output
//2-> check if a is divisible by b, print true/false as output
//3-> check if b is divisible by a, print the true/false as output
//4-> find a%b, print the ans as output
//5-> swap a and b, print the a and b as output
//Otherwise print wrong input! As the message


package quick_basic;

import java.util.Scanner;

public class number_op {

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int op;
		int num1,num2;
		double ans;
		
		System.out.println("Enter the number 1");
		num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		num2 = sc.nextInt();
		
		System.out.println("Select from the following options");
		System.out.println("1 find the minimum number between the two numbers");
		System.out.println("2 check if a is divisible by b");
		System.out.println("3 check if b is divisible by a ");
		System.out.println("4 find the remainder of a%b");
		System.out.println("5 swap two numbers");
		
		op = sc.nextInt();
		
		switch(op)
		{
		
		 case 1:
			 ans = num1>num2 ? num2 : num1;
			 System.out.println("minimum number is "+ans);
			 break;
		 case 2:
			 if(num1%num2==0)
			 {
				 System.out.println("a is divsible by b");
			 }
			 else
			 {
				 System.out.println("not divisible");
				 
			 }
			 break;
		 case 3:
			 if(num2%num1==0)
			 {
				 System.out.println("b is divsible by a");
			 }
			 else
			 {
				 
				 System.out.println("not divisible ");
			 }
			 break;
		 case 4:
			 ans = num1%num2;
			 System.out.println("Remainder:"+ans);
			 break;
		 case 5:
			 System.out.println("num1:"+num1+" num2:"+num2+" before swap");
			 num1= num1+num2;
			 num2 = num1-num2;
			 num1 = num1-num2;
			 System.out.println("num1:"+num1+" num2:"+num2+" after  swap");
			 break;
		 default :
			 System.out.println("invalid option selected");
			 
		}
		
		
		
		
		
		
		
	}
	
}
