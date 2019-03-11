package importing_Accounts_from_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Accounts.Account;
import Accounts.Account_bag;

public class Import_main 
{
	public  static int index=0;  
	public  static Account_bag Bag=new Account_bag();
	public  static ArrayList<String> LastNameArray=new ArrayList<>();


	public static void createFullNames() 
	{
		 try {
			 	importnames("Last_Names.txt");
			 	importnames("boys_names.txt");
			 	importnames("girls_names.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Bag.setupUniqueIds();
		Bag.setupUniqueUsernames();
		 Bag.setupPasswords();
		 Bag.insertionSort();
		 display();
//		 Account[] list=Bag.Accountlist.toArray(new Account[Bag.Accountlist.size()]);
//		 
//		 
//		 Account key=new Account();
//		 Scanner Keyboard=new Scanner(System.in);
//		 
//		 System.out.println("type username");
//		 String usern=Keyboard.next();
//		 key.setUsername(usern);
//	
//		 System.out.println(Account_bag.UsernameExist(list, key));
//		 
//		 
//		 System.out.println("type password");
//		 String pass=Keyboard.next();
//		 key.setPassword(pass);
//		 
//		 System.out.println(Account_bag.PasswordExist(list, key));
//		 if(Account_bag.UsernameExist(list, key)&&Account_bag.UsernameExist(list, key))
//		 {
//			 System.out.println("Success!");
//		 }
		 
	}
	
	

	
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

				  Account newname=new Account();
				  
				  if(filename=="boys_names.txt")
					   newname=new Account(firstname,LastNameArray.get(randindex),"Male");					//BOYS mixing first and last names

				  if(filename=="girls_names.txt")
					   newname=new Account(firstname,LastNameArray.get(randindex),"Female");				//GIRLS mixing first and last names

				  Bag.add(newname);
				  
				  index++;
			  }
	  
		  } while(Keyboard.hasNext());
		  Keyboard.close();

	}

	
	
	
	public static void display()
	{
		for(int i=0;i<Bag.Accountlist.size();i++)
		{
			System.out.println((1+i)+"."+Bag.Accountlist.get(i).getFirst_name()
								+" "+Bag.Accountlist.get(i).getLast_name()
								+" "+Bag.Accountlist.get(i).getGender()
								+" "+Bag.Accountlist.get(i).getID()
								+" "+Bag.Accountlist.get(i).getUsername() 
								+" "+Bag.Accountlist.get(i).getPassword()
								+" "+Bag.Accountlist.get(i).getGPA()
								);
		}
	}
	
	
	
	

}
