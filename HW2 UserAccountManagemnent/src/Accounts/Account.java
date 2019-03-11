package Accounts;

public class Account 
{

	private String first_name;
	private String last_name;
	private String gender;
	private String ID=" ";
	private String username="";
	private String password;
	private Double GPA;

	

	public Account() {}
	public Account(String first_name,String last_name,String gender)
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.gender=gender;
		this.GPA= ((Math.random() * ((4.0 - 0))) + 0);
		this.GPA=round(GPA,2);
	}
	

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gPA) {
		GPA = gPA;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//rounding 
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}

}
