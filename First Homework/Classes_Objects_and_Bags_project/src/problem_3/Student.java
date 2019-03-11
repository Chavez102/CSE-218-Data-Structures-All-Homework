package problem_3;

public class Student 
{
	private String std_first_name,std_last_name,gender;
	private int id;
	private double GPA;
	
	public Student(String first_name, String last_name, String gender, double randgpa, int id) {
		
		this.std_first_name=first_name;
		this.std_last_name=last_name;
		this.gender=gender;
		this.GPA=randgpa;
		this.id=id;
		
	}

	public String getStd_first_name() {
		return std_first_name;
	}
	public void setStd_first_name(String std_first_name) {
		this.std_first_name = std_first_name;
	}
	public String getStd_last_name() {
		return std_last_name;
	}
	public void setStd_last_name(String std_last_name) {
		this.std_last_name = std_last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	

	public void Displayinfo()
	{

		System.out.println("first name:"+this.std_first_name+"\n"+
							"Last_name:"+this.std_last_name+"\n"+
							"Gender:"+this.gender+"\n"+
							"id:"+this.id+"\n"+
							"GPA:"+this.GPA+"\n"
							);
	}
	

}
