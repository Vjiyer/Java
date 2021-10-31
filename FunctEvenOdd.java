package Com.Geeksterclasses;

import java.util.Scanner;

public class FunctEvenOdd {

	public static void EvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("EVEN");
			return;
		}
		else
		{System.out.println("ODD");}
		return;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= s.nextInt();
		
		EvenOdd(num);
	}
}
