package Com.Geeksterclasses;

import java.util.Scanner;

public class CountDigit {
	public static void main (String[] args) {
		int num, count=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		num = scan.nextInt();
		
		while (num!=0){
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
