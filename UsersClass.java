package Com.Geeksterclasses;

public class UsersClass {
	
	private int userId;
	private String userName;
	private String firstname;
	private String lastname;

	
	void setUserId(int userId)
	{
		this.userId = userId;
	}
	void setUsername(String userName)
	{	this.userName =userName;
	}
	void setfirstname(String firstName)
	{	firstname = firstName;	}
	void setlastname(String lastName)
	{	lastname=lastName;	}
	
	
	int getUserId()
	{return this.userId;}
	
	String getUsername()
	{return this.userName;}
	
	String getfirstname() 
	{return this.firstname;}
	
	String getlastname()
	{return this.lastname;}
	
	}
