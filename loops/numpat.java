import java.util.*;

public class numpat{
	public static void main(String[]args)
	{

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int x = sc.nextInt();

      for(int i =1;i<=x;i++)
      {   

          for(int j =1;j<=x;j++)
          {
          	
                for(int k = i;k<=x;k++)
                {

                 System.out.print(j);

                }

          }
          
          System.out.println("");

  
      }
        

	}
}