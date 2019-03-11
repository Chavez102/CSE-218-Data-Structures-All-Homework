package generic_Bag;

public class Demo {

	public static void main(String[] args) {
		Generic_Bag_Class<String> bag=new Generic_Bag_Class<>();
		bag.add("zhrdf");
		bag.add("hello");
		bag.add("Chavez");
		bag.add("Bryan");

		
	
		
//		bag.add(5);
//		bag.add(10);
//		bag.add(2);
//	System.out.println("max is:"+bag.findMax());
//	System.out.println("min is:"+bag.findMin());
	System.out.println("original:");
	System.out.println(bag.display());
	
	bag.insertionSort();
	System.out.println(bag.display());


		

	}

}
