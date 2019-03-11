package blowing_in_The_Wind;

public class BabyLink 
{
	public String nextword;
	public BabyLink next;
	public BabyLink previous;
	
	
	public BabyLink(String nextword)
	{
		this.nextword=nextword;
		next=null;
		previous=null;
	}
	public void displayLink()
	{
		System.out.print(nextword+" ");
	}
	
	
	
	public String getnextword() {
		return nextword;
	}
	public void setdData(String dData) {
		this.nextword = dData;
	}
	
	
	

}
