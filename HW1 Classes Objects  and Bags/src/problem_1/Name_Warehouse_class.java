package problem_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Name_Warehouse_class 
{
	public  static int index=0;  
	public  static Name_Bag Bag=new Name_Bag();
	public  static ArrayList<String> LastNameArray=new ArrayList<>();


	public static void createFullNames() throws FileNotFoundException
	{
		 importnames("Last_Names.txt");
		 importnames("boys_names.txt");
		 importnames("girls_names.txt");
	}

	
//Homework problem 1
	public static void importnames(String filename) throws FileNotFoundException
	{
		Scanner Keyboard = new Scanner(new File(filename));
		  do
		  {
			  if(filename=="Last_Names.txt")
			  {
				  String lastname=Keyboard.next();

				  LastNameArray.add(lastname);  
			  }
			  if(filename=="boys_names.txt")
				  Keyboard.next();//skips through "1.","2,","3." section
			  
			  if(filename=="boys_names.txt"|| filename=="girls_names.txt")
			  {
				  String firstname=Keyboard.next();
			    //random range formula=(Math.random() * ((max - min) + 1)) + min
				  int randindex=(int) ((Math.random() * ((1999 - 0) + 1)) + 0); 

				  Name newname=new Name();
				  
				  if(filename=="boys_names.txt")
					   newname=new Name(firstname,LastNameArray.get(randindex),"Male");					//BOYS mixing first and last names

				  if(filename=="girls_names.txt")
					   newname=new Name(firstname,LastNameArray.get(randindex),"Female");				//GIRLS mixing first and last names
				  Bag.add(newname);
				  index++;
			  }
	  
		  } while(Keyboard.hasNext());
		  Keyboard.close();

	}

	public static void display()
	{
		for(int i=0;i<Bag.namelist.size();i++)
		{
			System.out.println((1+i)+"."+Bag.namelist.get(i).getFirst_name()
								+" "+Bag.namelist.get(i).getLast_name()
								+" "+Bag.namelist.get(i).getGender());
		}
	}
	

}


