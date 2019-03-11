package stack_and_queue_Linklist;

public class Queue_LinkList 
{
	public Link first;
	private Link last;
	
	public Queue_LinkList() {
		first = null;
		last = null;
	}
	
	public Link deleteLast() {
		Link temp = last;
		if(first.next == null) {
			first = null;
			last=null;
		}
		else
		{
		last.previous.next = null;
		last = last.previous;
		}
		return temp;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		if(first.next == null) {
			last = null;
			first=null;
		}
		first.next.previous = null;
		first = first.next;
		return temp;
	}
	
	public void insertLast(Student dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}
		last.next = newLink;
		newLink.previous = last;
		last = newLink;
	}
	
	public void insertFirst(Student dData) {
		String IDstring;
		do{ 
			IDstring=Integer.toString((int) ((Math.random() * ((99999999 - 0) + 1)) + 0));  		
		}while (IDisUnique(IDstring)==false);
		dData.setID(IDstring);
		
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
			first=newLink;
		}
		else
		{
		first.previous = newLink;
		newLink.next = first;
		first = newLink;
		}
	}

	public boolean IDisUnique(String newid)
	{
		
		Link current=first;
		while(current!=null)
		{
			if(current.dData.getID().equals(newid))
				return false;
			current=current.next;
		}
		return true;
	}
	public boolean isEmpty() {
		return first == null;
	}
	
	public String getList()
	{
		
		Link current=first;
		String str="";
		
		while(current!=null)
		{
		
			str=current.displayLink()+"\n"+str;
			current=current.next;
			
			
		}
		return str;
				
	}
}
