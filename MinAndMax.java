package Com.Geeksterclasses;

public class MinAndMax{
	public static void main(String [] args)
	{
		int[] arr= {18,6,31,7,9,12,78,34,11,13,44};
		int max=Integer.MIN_VALUE;	
		for (int i = 0; i < arr.length; i++)
		{  
	         
	           if(arr[i]>max)  
	               max = arr[i];  
	        }  
			
		System.out.println("Maximum number is "+ max);
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{  
         
           if(arr[i] <min)  
               min = arr[i];  
        }  
		System.out.println("Minimun number is "+ min);
	}

}