package Com.Geeksterclasses;

import java.util.Scanner;
public class FunctFact {
	

	public  static void Factorial(int n)
	{
		if(n<0)
		{System.out.println("Invalid Input");
		return;
		}
		int fact=1;
		for(int a=n;a>=1;a--)
		{
			fact=fact*a;
		}	System.out.println("Factorial of the number is: " + fact);
			return;
	}
		
		
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n=sc.nextInt();
			
			Factorial(n);
		}
}
