package Com.Geeksterclasses;

public class MissingNumInArr {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
		int n = arr.length +1;
		int sum = n*(n+1)/2;
		for(int i = 0; i< arr.length; ++i)
		{
			sum = sum-arr[i];
		}
		System.out.println("Missing number is "+sum);
	}

}