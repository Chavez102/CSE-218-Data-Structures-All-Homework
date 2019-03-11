package airport_Operation;

public class Demo {

	public static void main(String[] args) {
		Flight f1=new Flight(1,"1:02","name",3);
		Flight f2=new Flight(2,"2:15","name",3);
		Flight f3=new Flight(3,"3:01","name",3);
		Flight f4=new Flight(3,"3:30","name",3);
		
		
		
		Priority_Queue thePQ=new Priority_Queue(20);
		
		thePQ.insert(f1);
		thePQ.insert(f2);
		thePQ.insert(f3);
		thePQ.insert(f4);
	
		
		System.out.println();
		
		thePQ.displayQ();
		System.out.println("hwllo");
		thePQ.displayQ();
		System.out.println("hwllo");
		
		
	
	}

}
