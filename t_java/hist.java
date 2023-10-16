// debugging rand_arr by individually 

package t_jav;

public class hist {

	
	
	public static int inRange(int arr[],int high,int low)
	{
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			if((arr[i]>= low) && (arr[i]<high))
			{
				//System.out.printf("%4d",arr[i]);
				count++;
			}
		
		}
		//System.out.println("");
		return count;
		
	}
	 
	
	public static int[] hist(int size,int[] scores)
	{
		
		int[] res = new int[100];
		for(int i =0;i<res.length;i++)
		{
			res[i] = inRange(scores,i,i+1);
		}
		
		
		return res;
	}
	
	
	public static void main(String[]args)
	{
		
	    int[] arr = {1,2,3,4,56,78,90,98,76,54,32,12,34,56,78,90,98,76,53,63,47,73,87,37,40,7,63};
	    int res = inRange(arr,100,1);
	    System.out.println(res);
		
	}
}
