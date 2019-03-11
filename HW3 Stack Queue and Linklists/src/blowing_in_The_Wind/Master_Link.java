package blowing_in_The_Wind;

public class Master_Link 
{
	public String unique_word;
	public Baby_LinkList babylinklist=new Baby_LinkList();
	public Master_Link next;
	public Master_Link previous;
	
	
	public Master_Link(String dData)
	{
		this.unique_word=dData;
		next=null;
		previous=null;
	}
	public void displayLink()
	{
		
		System.out.print("\n unique_word:"+unique_word+" following word: ");
		babylinklist.displayForward();
		
		
		
	}
	

}
