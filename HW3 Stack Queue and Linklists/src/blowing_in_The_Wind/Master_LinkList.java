package blowing_in_The_Wind;

public class Master_LinkList 
{
	public Master_Link current;
	public Master_Link first;
	public Master_Link last;
	
	public Master_LinkList()
	{
		first=null;
		last=null;
	}
	
	
	public boolean findMasterLink(String key)
	{
		if(isEmpty())
		{return false;}
		
		
		Master_Link current=first;
		
			while(!current.unique_word.equals(key))
			{
				current=current.next;
				if(current==null)
					return false;
			}
		return true;
	}
	
	public Master_Link gettheMasterLink(String key)
	{
		if(isEmpty())
		{return null;}
		Master_Link current=first;
		
			while(!current.unique_word.equals(key))
			{
				current=current.next;
				if(current==null)
					return null;
			}
		return current;
	}
	
	
	
	
	
	public boolean inserAfter(String key,String dData)
	{
		Master_Link current=first;
		while(current.unique_word!=key)
		{
			current=current.next;
			if(current==null)
				return false;
		}
	
	
		Master_Link newLink=new Master_Link(dData);
	
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
		Master_Link newlink=new Master_Link(dData);
		
		if(isEmpty())
		{
			first=newlink;
		}
		last.next=newlink;
		newlink.previous=last;
		last=newlink;

	}
	
	public Master_Link Deletelast()
	{
		Master_Link temp=last;
		if(first.next==null)
		{
			first=null;
		}
		
		last.previous.next=null;
		last=last.previous;

		return temp;
	}
	
	public Master_Link DeleteFirst()
	{
		Master_Link temp=first;
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
		Master_Link newlink=new Master_Link(dData);
	
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
	
	public boolean insertBefore(Master_Link key,String dData)
	{
		Master_Link current=first;
		while(current.next!=key)
		{
			current=current.next;
			if(current==null)
				return false;
		}
		
		Master_Link newLink=new Master_Link(dData);
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
	
	
	public Master_Link deleteKey(String key)
	{
		Master_Link current=first;
		while(current.unique_word!=key)
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
//		System.out.println("list(first-->last)");
		Master_Link current=first;
		while(current!=null)
		{
		
			current.displayLink();
			current=current.next;
		}
		System.out.println();
		
	}
	
	public void displaybackward()
	{
		System.out.println("list(last-->first)");
		Master_Link current=last;
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
