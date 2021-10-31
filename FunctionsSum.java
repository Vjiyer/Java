package Com.Geeksterclasses;

import java.util.Scanner;

public class FunctionsSum {

	public static int CalculateSum(int a, int b)
	{
		int sum= a+b;
		return(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the first number: ");
		int a =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		
		int sum = CalculateSum (a,b);
		System.out.println("Sum of 2 numbers is: " + sum);
	}
}						
