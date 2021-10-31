package Com.Geeksterclasses;
import java.util.*;

public class SwitchCase {
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    int a = sc.nextInt();
	    System.out.println("Enter second number: ");
	    int b = sc.nextInt();
	    System.out.println("Select any one operation: ");
	    System.out.println("1: Addition\n2: Substract\n3: Multiply\n4: Division\n5: Remainder\n");
	    int c= sc.nextInt();
	    
	    switch(c){
	    
	    case 1: System.out.println(a+b);
	            break;
	            
	    case 2: System.out.println(a-b);
	            break;
	            
	    case 3: System.out.println(a*b);
	            break;
	            
	    case 4: System.out.println(a/b);
	            break;	
	            
	    case 5: System.out.println(a%b);
	            break;	 
	   default: System.out.println("Invalid Input");
	    }
	    
	}
}

