package airport_Operation;

public class Priority_Queue 
{
	private int maxSize;
	private Flight[] queArray;
	private int nElems;
	
	
	
	public int getnElems()
	{
		return nElems;
	}
	public void setElems(int e)
	{
		nElems=e;
	}
	
	
	
	public Priority_Queue(int maxSize) {
		this.maxSize = maxSize;
		nElems = 0;
		queArray = new Flight[maxSize];
	}
	
	public void insert(Flight item) {
		int j;
		if(nElems == 0) { // empty
			queArray[nElems++] = item; // insert at index 0
		
		}
		else { // if not empty
			for(j = nElems-1; j >= 0; j--) // start at end
			{ 
				
				if(item.Landing_Priority_level == queArray[j].Landing_Priority_level)
				{
		
					if(item.getTime_Stamp()>queArray[j].getTime_Stamp())
					{
						Flight temp=queArray[j];
						queArray[j]=item;
						item=temp;
					}
				}
				
				if(item.Landing_Priority_level < queArray[j].Landing_Priority_level)  // shift upward
				{
					queArray[j+1] = queArray[j];
				} 
				else {break;}
			} // end for loop
			
			queArray[j+1] = item; // insert it
			nElems++;
		}
	}
	
	public Flight remove() 
	{
		return queArray[--nElems];
	}
	
	public String displayQ()
	{
		int tempnElems=nElems;
		String str="";
		while(!isEmpty())
		{
			Flight item=remove();
			str=str+item.getLanding_Priority_level()+" "+item.getTime_Stamp()+"\n";
		}
		nElems=tempnElems;
		return str;
	}
	
	
	
	
	
	public Flight peemMin() {
		return queArray[nElems-1];
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
}
