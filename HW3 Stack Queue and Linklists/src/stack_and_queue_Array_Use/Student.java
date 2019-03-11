package stack_and_queue_Array_Use;

public class Student 
{
	private String name;
	private double GPA;
	private String ID;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Student(String name,double GPA)
	{
		this.name=name;
		this.GPA=GPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
