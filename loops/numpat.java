import java.util.*;

public class numpat{
	public static void main(String[]args)
	{

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int x = sc.nextInt();

      for(int i =1;i<=x;i++)
      {   int count =1;

          for(int j =i;j<=x;j++)
          {
          	

            
                for(int k = 1;k<=x;k++)
                {

                 System.out.print(count);

                }

                count++;

             

          }
          
          System.out.println("");

  
      }
        

	}
}