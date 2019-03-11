package problem_1;

import java.util.ArrayList;

public class Name_Bag {

	public ArrayList<Name> namelist= new ArrayList<>();
	
	public Name_Bag(){}
	
	public void add(Name name)
	{
		namelist.add(name);
	}
	
	public void remove(int index)
	{
		namelist.remove(index);
	}
	
	public void remove(Name nameobject)
	{
		namelist.remove(nameobject);
	}
	
}
