package Com.Geeksterclasses;
import java.util.*;

public class UppercaseMethod {

	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String to convert UpperCase:");
		String str = S.nextLine(); 
		S.close();
		String obj = UpperCase(str);
		System.out.println(obj);
	

	}
	public static String UpperCase(String str) {
		return str.toUpperCase();
	}

}