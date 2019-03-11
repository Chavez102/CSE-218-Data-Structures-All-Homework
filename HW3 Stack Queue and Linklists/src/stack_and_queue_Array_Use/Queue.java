package stack_and_queue_Array_Use;

public class Queue 
{
	
	private int maxSize;
	private Student[] queArray;
	



	private int front;
	private int rear;
	public int nElems;
	
	public Queue(int maxSize)
	{
		this.maxSize=maxSize;
		queArray=new Student[maxSize];
		front=0;
		rear=-1;
		nElems=0;
		
	}
	
	public boolean isEmpty()
	{
		return nElems==0;
	}
	
	public boolean isFull()
	{
		return nElems==maxSize;
	}
	
	public int size()
	{
		return nElems;
	}
	
	
	public Student peekfront()
	{
		return queArray[front];
	}
	
	
	
	public Student remove()
	{
		Student temp=queArray[front++];
		if(front==maxSize)
		{
			front=0;
		}
		nElems--;
		return temp;
		
	}
	
	
	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}



	public void insert(Student n)
	{
		if(rear==maxSize-1)	//wrap around
		{
			rear=-1;
		}
		
		String IDstring;
		
		do{ 
			IDstring=Integer.toString((int) ((Math.random() * ((99999999 - 0) + 1)) + 0));  		
		}while (IDisUnique(IDstring)==false);
			
		n.setID(IDstring);	
		queArray[++rear]=n;
		nElems++;

		
	}
	
	
	public Student[] getQueArray() 
	{
		return queArray;
	}
	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}
	
	public void clearQueue()
	{
		queArray[0]=null;
		front=0;
		rear=-1;
		nElems=0;
	}
	
	
	
	public boolean IDisUnique(String newid)
	{
		
		for(int i=front;i<=rear;i++ )
		{	 
			if(queArray[i].getID().equals(newid))
			{
				return false;
			}
			
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
