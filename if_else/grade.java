// grade based on avg of 5 subjects
package quick_basic;

import java.util.Scanner;
public class grade {
	
	public static void main(String [] args)
	{
		int sub1,sub2,sub3,sub4,sub5;
		int res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter subject 1 out of 100");
		sub1 = sc.nextInt();
		System.out.println("enter subject 2 out of 100");
		sub2 = sc.nextInt();
		System.out.println("enter subject 3 out of 100");
		sub3 = sc.nextInt();
		System.out.println("enter subject 4 out of 100");
		sub4 = sc.nextInt();
		System.out.println("enter subject 5 out of 100");
		sub5 = sc.nextInt();
		
		res = (sub1+sub2+sub3+sub4+sub5)/5;
		
		if(res>=90) System.out.println("A");
		else if(res>=80) System.out.println("B");
		else if(res>=70) System.out.println("C");
		else if(res>=60) System.out.println("D");
		else if(res>=40) System.out.println("E");
		else System.out.println('F');
	}

}
