package problem_3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import problem_1.Name_Warehouse_class;

/*Problem 3 (Student Factory) Use the name factory to construct a student factory. The student
factory will return one student object each time when a gender is provided to it. The
student class will contain the following fields: first name, last name, gender, a unique
id, and a random GPA between 0.0 and 4.0, inclusive. Write a Demo program to test
the module.*/


public class Student_Factory 
{
	public static boolean unique=false;
	static ArrayList<Student> student_list=new ArrayList<>();
	public Student_Factory()
	{}
	
	public static Student get_Student(String Gender) throws FileNotFoundException
	{
		 Student student;
		double randgpa=(Math.random() * ((4.0 - 0.0) + 1)) + 0.0;
		int id;
		
	

		for(int i=0; i<Name_Warehouse_class.Bag.namelist.size();i++)
		 {
			
			 do {
				 id=(int) ((Math.random() * ((11000 - 9000) + 1)) + 9000);
			 }while(IDisUnique(id)==false);
			
			 if (Name_Warehouse_class.Bag.namelist.get(i).getGender().equals(Gender))
			 {
				
				 do {
					  student=new Student(Name_Warehouse_class.Bag.namelist.get(i).getFirst_name()
			 					,Name_Warehouse_class.Bag.namelist.get(i).getLast_name()
							    ,Name_Warehouse_class.Bag.namelist.get(i).getGender()
							    ,randgpa
							    ,id);
					//  System.out.println(student.getStd_first_name()+"  "+student.getStd_last_name());
					i++; 
				 }while(student_is_new(student)==false&&i<Name_Warehouse_class.Bag.namelist.size());

				 student_list.add(student);
				
				 return student;

			 }
			 unique=false;
		 }
		System.out.println("no more students with that gender");
		return null;

	}
	
	public static boolean IDisUnique(int checkId)
	{
		for (int i=0;i<student_list.size();i++)
		{
			if(student_list.get(i).getId()==checkId)
				return false;
		}
		unique=true;
		return true;
	}
	
	public static boolean student_is_new(Student student)
	{
		for (int i=0;i<student_list.size();i++)
		{

			
				if(student_list.get(i).getStd_first_name().equals(student.getStd_first_name()));
				{
					System.out.println("1."+student_list.get(i).getStd_first_name()+"======"+student.getStd_first_name());
					System.out.print("  2."+student_list.get(i).getStd_last_name()+"======"+student.getStd_last_name());
					return false;
				}
			
		}

		return true ;
	}
	
}
