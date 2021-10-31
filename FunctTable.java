package Com.Geeksterclasses;

import java.util.Scanner;

public class FunctTable {

	public static void Table(int num)
	{	
		int n=1;
		for(int a=1; a<=10; a++)
		{	
			n=num*a;
			System.out.println(num + "*" + a + "="+ n );
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		
		Table(num);
	
	}
}
