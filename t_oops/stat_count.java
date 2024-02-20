// demonstration of static variable in class 


import java.util.*;
import java.lang.*;

class count{
    // is common for all objects of class Stat_count
    public static  int keep =0 ;

 }


public class stat_count{
   


	public static void main(String[] args)
	{

      
      count c1 = new count();
      c1.keep = 1;

      System.out.println(c1.keep);
      count c2 = new count();
      
      c2.keep++;
      
      // the static variable is shared between all the objects of the class 
      // changes made by one object reflects in the other 
      
      System.out.println(c2.keep+" "+c1.keep);
      


	}
}