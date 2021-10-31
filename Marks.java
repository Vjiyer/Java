package Com.Geeksterclasses;

import java.util.*;
public class Marks
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int input;
	    
	    do{
            System.out.println("Enter the marks of the student out of 100: ");
	        int marks = sc.nextInt();
	        
	        if (marks>=90 && marks<=100){
	            System.out.println("This is Good");
	        }
	        else if (89 >= marks &&  marks >= 60) 
	        {
	             System.out.println("This is also Good");
	        }
	        else if (59 >= marks &&  marks >= 0)  
	        {
	             System.out.println("This is Good as well");
	        }
	        else {
               System.out.println("Invalid");
	        }
	        
	    System.out.println("Want to continue ? (yes(1) or no(0))");
           input = sc.nextInt();
           
	    }
	     while(input == 1);
	    
	    }
}
