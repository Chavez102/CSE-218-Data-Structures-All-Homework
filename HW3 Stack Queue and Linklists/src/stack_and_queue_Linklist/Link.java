package stack_and_queue_Linklist;

public class Link 
{
	public Student dData;
	public Link next;
	public Link previous;
	
	public Link(Student dData) {
		this.dData = dData;
		next = null;
		previous = null;
	}
	
	public String displayLink() {
		return dData.getName()+"           "+
			   dData.getGPA() +"        "+
			   dData.getID();
		
		
		
	}
	
}
