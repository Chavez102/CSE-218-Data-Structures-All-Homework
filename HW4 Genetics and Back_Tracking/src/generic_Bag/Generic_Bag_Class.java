package generic_Bag;

import java.util.ArrayList;
import java.util.Arrays;

import back_Track.Stack;
//add, display, findMax, findMin, deleteMax,
//DeleteMin, and insertionSort.
public class Generic_Bag_Class<T extends Comparable> 
{
	Stack stack=new Stack();
	ArrayList<T> arraylist=new ArrayList<>();

	public Generic_Bag_Class() {
	}




	public String display(){
		String str="";
		for(int i=0;i<arraylist.size();i++){
			str=str+arraylist.get(i)+" ";
		}
		return str+"\n";
		
	}
	
	public void insertionSort() {
		
	
		int in;
		int out;
		
		for(out=1;out<arraylist.size();out++)
		{
			T temp=arraylist.get(out);
			in = out;
			
			while(in>0&& (arraylist.get(in-1).compareTo(temp)>=0))
			{
				arraylist.set(in,arraylist.get( in-1));
				in--;
			}
			arraylist.set(in, temp);
		}
		
		
	}

	
	public void deleteMin() {//return smallest number
		ArrayList<T> Temparray=new ArrayList<>(arraylist);
		insertionSort();
		T min=arraylist.get(0);
		arraylist=Temparray;
		
		arraylist.remove(min);
	}
	
	public void deleteMax() 
	{
		ArrayList<T> Temparray=new ArrayList<>(arraylist);;

		insertionSort();
		
		
		T max=arraylist.get(arraylist.size()-1);
		arraylist=Temparray;
		
		arraylist.remove(max);
	
	}
	
	
	
	
	public T findMin() {//return smallest number
		ArrayList<T> Temparray=new ArrayList<>(arraylist);
		insertionSort();
		T min=arraylist.get(0);
		arraylist=Temparray;
		return min;
	}
	
	
	
	
	
	public T findMax() {
		ArrayList<T> Temparray=new ArrayList<>(arraylist);;

		insertionSort();
		
		
		T max=arraylist.get(arraylist.size()-1);
		arraylist=Temparray;
		
		return max;
	}

	public void add(T dData)
	{
		arraylist.add(dData);
	}
	
	
	

}
