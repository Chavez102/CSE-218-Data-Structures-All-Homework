package generic_Binary_Search;

public class Demo {

	public static void main(String[] args) {
	
		String[] letters= {"A","B","C","D"};
		Integer[] numbers= {1,2,3,4,5,6};
		
		System.out.println(Generic_Binary_Search.binarySearch(letters, "C"));
		
		
		System.out.println(Generic_Binary_Search.binarySearch(numbers, 9));
		
		
	}

}
