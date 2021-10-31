package Com.Geeksterclasses;
import java.util.*;
public class CheckAlphaNumClass1 
	
{
	public static void main(String[] args) {
	    
	    Scanner S = new Scanner(System.in);
	   	System.out.println("Enter the String: ");
	   	String str = S.next();
	   	String result = CheckStr(str);
	   	System.out.println(result);
	   	
	}
	
	public static String CheckStr(String name)
	{
	    if(name.matches("[a-zA-Z0-9]*"))   
	    return ("The string is alpha numeric");
	    else
	    return("The string is not alpha numeric");
	    
	}
}