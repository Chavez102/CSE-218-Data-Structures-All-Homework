package stack_and_queue_Linklist;

public class Demo {

	public static void main(String[] args) {
		Queue_LinkList queue=new Queue_LinkList();
		
		
		Student st1=new Student("name1",1);
		Student st2=new Student("name2",2);
		Student st3=new Student("name3",3);
				
		
		queue.insertFirst(st1);
		queue.insertFirst(st2);
		queue.insertFirst(st3);

		System.out.println(queue.getList());
		
		System.out.println("///////////////////");
		
		queue.deleteFirst();
		
		
		System.out.println(queue.getList());

	}

}
