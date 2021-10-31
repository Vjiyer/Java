package Com.Geeksterclasses;

import java.util.Scanner;

public class CheckOccurenceArray {
	public static void main(String[] args)
	{
	   Scanner S = new Scanner(System.in);
	   int num[] = new int[5];
	   for (int i=0;i<5;i++)
	   {
	       num[i]=S.nextInt();
	   }
	   int target = 2;
	   for (int i=0;i<5;i++)
	   {
	       if(target == num[i])
	        { System.out.println("Yes");}
	        else;
	        {System.out.println("No");}
	       
	   }
	}
}
