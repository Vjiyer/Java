package Com.Geeksterclasses;

import java.util.Scanner;

public class FunctionsProduct {
	public static int CalculateProduct(int a, int b){
		return a*b;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a= sc.nextInt();
		System.out.println("Enter second number: ");
		int b= sc.nextInt();
		System.out.println("Product of 2 numbers is: " + CalculateProduct (a,b));
		
	}
}
