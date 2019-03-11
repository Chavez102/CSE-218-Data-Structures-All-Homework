package generic_Binary_Search;

public class Generic_Binary_Search {
	public static <E extends Comparable<E>>E binarySearch(E[] list, E key) {
		int low = 0;
		
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;

			if (key.compareTo(list[mid])==-1) {
				high = mid - 1;
			} else if (key == list[mid]) {
				//return list[mid];
				return (E) "Element found";
			} else {
				low = mid + 1;
			}
		}
		//return null;
		return (E) "Element Not found";
	}

}
