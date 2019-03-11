package stack_and_queue_Array_Use;

public class Stack 
{
	private Student[] stackArray;
	
	private int maxSize;
	private int top=-1;
	
	public Stack(int maxSize)
	{
		
		this.maxSize=maxSize;
		stackArray=new Student[maxSize];
	}
	
	public void push(Student n)
	{
		String IDstring;
		do{ 
			IDstring=Integer.toString((int) ((Math.random() * ((99999999 - 0) + 1)) + 0));  		
		}while (IDisUnique(IDstring)==false);
			
		n.setID(IDstring);	
		
		stackArray[++top]=n;
	
	
	}
	
	public boolean IDisUnique(String newid)
	{
		int i=0;
		while(i-1<top)
    	{ 
			if(stackArray[i].getID().equals(newid))
				return false;
			i++;
		}
		return true;
	}
	
	public Student pop()
	{

		return stackArray[top--];
	}
	
	public Student peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void clearStack()
	{
		stackArray[0]=null;
		top=-1;
	}
	
	public boolean isfull()
	{
		return top==maxSize-1;
	}
	
	public Student[] get_stackArray()
	{
		return stackArray;	
	}
	
	
	public int gettop()
	{return top;}
	

}
