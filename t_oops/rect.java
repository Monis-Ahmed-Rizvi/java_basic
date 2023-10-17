// rectangle class and methods that retun objects
package t_oop;
import java.awt.Rectangle;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
public class rect {
    
	
	public static Point center(Rectangle box)
	{
		
		int x = box.width / 2;
		int y = box.height / 2;
		
		
		return new Point(x,y) ;
	}
	
	
	
	
	// object mutability 
	
	public static void move(Rectangle box,int x,int y)
	{
		
		box.x = box.x + x;
		box.y = box.y + y;
		
	}
   
	public static void main(String[] args)
   {
	   //Rectangle rObj = new Rectangle(x,y,width,height);
	   Rectangle rObj = new Rectangle(0,0,100,200);
	   System.out.println(rObj);
	   Point box = center(rObj);
	   System.out.println(box);
	   
	    
	   System.out.println(rObj);
	   move(rObj,10,10);
	   System.out.println(rObj);
	   
	   // aliasing in objects
	   
	   Rectangle myBox = rObj;
	   // making changes to one will changes the other 
	   
	   myBox.translate(30, 40);
	   System.out.println(myBox+"myBox");
	   System.out.println(rObj+"rObj");
	   
	   
   }
	
	
	
}
