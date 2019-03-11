package back_Track;

public class Stack {
	private long[] stackArray;
	private int maxSize=101;
	private int top;
	
	public Stack() {

		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long n) {
		stackArray[++top] = n;
	}
	
	public long pop() {
		if(top>0)
		return stackArray[top--];
		else
		{
			return stackArray[0];
		}
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	
	public long SecondtoLast()
	{
		
		int position=top-1;
		if(position>-1)
		return stackArray[position];
		else
		{
			return stackArray[0]; 
		}
	}
	
	
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}

}
