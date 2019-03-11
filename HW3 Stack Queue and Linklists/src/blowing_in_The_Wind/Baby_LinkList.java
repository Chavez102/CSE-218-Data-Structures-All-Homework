package blowing_in_The_Wind;

public class Baby_LinkList 
{
	
	public BabyLink first;
	public BabyLink last;
	
	public Baby_LinkList()
	{
		first=null;
		last=null;
	}
	
	public boolean inserAfter(String key,String dData)
	{
		BabyLink current=first;
		while(current.nextword!=key)
		{
			current=current.next;
			if(current==null)
				return false;
		}
	
	
	BabyLink newLink=new BabyLink(dData);
	
		if(current==last)
		{
			newLink.next=null;
		last=newLink;
		}
		else 
		{
			newLink.next=current.next;
			current.next.previous=newLink;
		}
	newLink.previous=current;
	current.next=newLink;
	return true;
		
	}

	public void insertLast(String dData)
	{
		BabyLink newlink=new BabyLink(dData);
		
		if(isEmpty())
		{
			first=newlink;
		}
		last.next=newlink;
		newlink.previous=last;
		last=newlink;

	}
	
	public BabyLink Deletelast()
	{
		BabyLink temp=last;
		if(first.next==null)
		{
			first=null;
		}
		
		last.previous.next=null;
		last=last.previous;

		return temp;
	}
	
	public BabyLink DeleteFirst()
	{
		BabyLink temp=first;
		if(first.next==null)
		{
			last=null;
		}
		
		first.next.previous=null;
		
		first=first.next;
		
		return temp;
	}

	public void insertFirst(String dData)
	{
		BabyLink newlink=new BabyLink(dData);
		
		if(isEmpty())
		{
			last=newlink;
		}
		else
		{
		first.previous=newlink;
		}
		newlink.next=first;
		first=newlink;
		
		
	}
	
	public boolean insertBefore(String key,String dData)
	{
		BabyLink current=first;
		while(current.nextword!=key)
		{
			current=current.next;
			if(current==null)
				return false;
		}
		
		BabyLink newLink=new BabyLink(dData);
		if(current==first)
		{
			newLink.next=first;
			first.previous=newLink;
			first=newLink;
			
		}else
		{
			newLink.next=current;
			current.previous.next=newLink;
			newLink.previous=current.previous;
			current.previous=newLink;
		}
		
		return true;
		
		
		
		
	}
	
	
	public BabyLink deleteKey(String key)
	{
		BabyLink current=first;
		while(current.nextword!=key)
		{
			current=current.next;
		}
		
		if(current==first)
		{
			first= current.next;
		}
		else
		{
			current.previous.next=current.next;
		}
		
		if(current==last)
		{
			last=current.previous;
		}
		else 
		{
			current.next.previous=current.previous;
		}
		
		return current;
		
	}
	
	public void displayForward()
	{
		BabyLink current=first;
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
	
	public void displaybackward()
	{
		System.out.println("list(last-->first)");
		BabyLink current=last;
		while(current!=null)
		{
			current.displayLink();
			current=current.previous;
		}
		System.out.println();
	}

	public boolean isEmpty()
	{
		return first==null;
	}
	

}
