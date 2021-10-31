package Com.Geeksterclasses;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsersClass vijay = new UsersClass();
		
		vijay.setUserId(1);
		vijay.setUsername("Vijay143");
		vijay.setfirstname("Vijay");
		vijay.setlastname("Iyer");
		
		UsersClass abha = new UsersClass();
		
		abha.setUserId(2);
		abha.setUsername("Abha143");
		abha.setfirstname("Abha");
		abha.setlastname("Pandey");
		
		
		System.out.println(vijay.getUserId());
		System.out.println(vijay.getUsername());
		System.out.println(vijay.getfirstname());
		System.out.println(vijay.getlastname());
		System.out.println();
		
		System.out.println(abha.getUserId());
		System.out.println(abha.getUsername());
		System.out.println(abha.getfirstname());
		System.out.println(abha.getlastname());

}
}