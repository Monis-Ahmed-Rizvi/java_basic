package t_oop;

public class time {
  private int hours;
  private int minutes;
  private double seconds;
  
  
  // constructor
  
  public time()
  {
	  this.hours = 0;
	  this.minutes = 0;
	  this.seconds = 0.0;
  }
  
  
  // constructor over loading 
  
  
  public time(int hours,int minutes,double second)
  {
	  this.hours = hours;
	  this.minutes = minutes;
	  this.seconds = second;
  }
  
  // getter methods 
  
  public int getHour()
  {
	  return hours;
  }
  
  

  public int getMinute()
  {
	  return minutes;
  }
  

  public double getSecond()
  {
	  return seconds;
  }
  
  // setter methods 
  
  public void  setHour(int hours)
  {
	  this.hours = hours;
  }
  

  public void  setMinute(int minutes)
  {
	  this.minutes = minutes;
  }
  

  public void setSecond(double seconds)
  {
	  this.seconds = seconds;
  }
  
  
  // to call time.printTime(timeobj) 
  
  public static void printTime(time t) 
  {
	  System.out.printf("%02d:%02d:%04.1f\n", t.hours, t.minutes, t.seconds);
  }
  
  //
  
  public String toString()
  {
	  return String.format("%02d:%02d:%04.1f\n", this.hours, this.minutes, this.seconds);
  }
  
  
  // creating a equals method to check for same values in diffrent object
  
  public boolean equals(time that)
  {
	  return this.hours == that.hours && this.minutes == that.minutes && this.seconds == that.seconds;
  }
  
  // display in 12:00 hour format
  
  public void displayFormat()
  {
	  
      String ampm = "";
      int hour_f = 0;
      if(this.hours < 12)
	  {
		  
		  
		  if(this.hours==0)
		  {
			  // midnight
			  hour_f = 12; 
		  }
		  ampm = "AM";
		  hour_f = this.hours;
	  }
      
      else if(this.hours>=12)
      {
    	  
    	  ampm = "PM";
    	  hour_f = this.hours - 12;
    	  if(this.hours==12)
    	  {
    		  hour_f = 12;
    	  }
      }
      
      System.out.printf("%2d:%2d: %.2f %s",hour_f,this.minutes,this.seconds,ampm);
      
      
	  
  }
  
  
  
}
