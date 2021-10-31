package Com.Geeksterclasses;

public class MaxNum {
	public static void main(String [] args) {
		int max=0;
		
		int[] arr= {22,45,85,99,7,1,25,47,03};
		int i=0;
		while(i<arr.length) {
			if(max<arr[i]) {
				max=arr[i];
			}
			i++;
		}
		System.out.println("Maximum number is "+ max);
	}

}
