// change format of 24hour to 12 hour 

package t_jav;
import java.util.*;
import java.lang.*;

public class time_format {

	public static String format(int hour, int minutes)
	{
		String ampm;
		if(hour<12)
		{
			ampm = "AM";
			// midnight 
		    if(hour==0)
		    {
		    	hour =12;
		    }
		}
		else
		{
			ampm = "PM";
			hour = hour - 12;
			
		}
		
		return String.format("%2d:%2d %s",hour,minutes,ampm);
		
	}
	
	
	public static void main(String[] args)
	{
		
		String res = format(24,45);
		System.out.println(res);
	}
	
	
}
