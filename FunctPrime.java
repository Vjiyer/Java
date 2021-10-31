package Com.Geeksterclasses;

import java.util.Scanner;

public class FunctPrime {

	public static void Prime(int num)
	{
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) 
	    {
	      
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	   }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= s.nextInt();
		
		Prime(num);
	}
}
