// find the max values provided from the comand line arguments

import java.util.*;
import java.lang.*;
import java.math.*;


public class max {


   public static int max_val(String arr[])
   {

     int max = Integer.MIN_VALUE;
     for(String str:arr)
     {
        int val = Integer.parseInt(str);
        if(val>max)
        {
        	max = val;
        }
     }

     return max;


   }


   public static void main(String[] args)
   {


     
     String[] arr = args;
     int res = max_val(arr);
     System.out.println("max : "+res);
     
     
   }



}
