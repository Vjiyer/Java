package Com.Geeksterclasses;

import java.util.Scanner;

public class B {

	public static void show() {
		//Method defined by static
		System.out.println("From Class B");
	}
	//methods with out using static.
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	
	public void  sum () 
    {
		
		System.out.println();
	//input From User by Scanner class.
	System.out.println("Enter First num: ");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	
	System.out.println("Enter Second num: ");
	Scanner s = new Scanner(System.in);
    int num2 = s.nextInt();
		
	int total = num1 + num2;
	System.out.println(total);
    }

}