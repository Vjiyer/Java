package Com.Geeksterclasses;

public class FindNUM {

	public static void main(String[] args)
	{
		int []arr = {24,25,35,25,25,478,65,98,54,25};
		 boolean flag=false;
		 int y=65;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==y)
			 {
				 flag=true;
			 }
			
		 }
		 if(flag==true) {
			 System.out.println("Number is present");
		 }
		 else{
		     System.out.println("Number is not present");
		 }
	}

}
