package Accounts;

import java.util.ArrayList;
import java.util.Random;

public class Account_bag 
{

	public ArrayList<Account> Accountlist= new ArrayList<>();
	

	//private Account[] a;
	
	
	public Account_bag(){}
	
	public void add(Account name)
	{
		String randstring=Integer.toString((int) ((Math.random() * ((99999999 - 0) + 1)) + 0)); 
		  
		 String ID=String.format("%08d", Integer.parseInt(randstring));

		Accountlist.add(name);
	
	}

	public void remove(int index)
	{
		Accountlist.remove(index);
	}
	
	public void remove(Account nameobject)
	{
		Accountlist.remove(nameobject);
	}
	
	public	void setupUniqueIds()
	{
		String IDstring;
		String ID;
	
		for(int i=0;i<Accountlist.size();i++)
		{
			
			do 
			{
			
			
				IDstring=Integer.toString((int) ((Math.random() * ((99999999 - 0) + 1)) + 0));  
				
			}while (IDisUnique(IDstring)==false);
			
			 ID=String.format("%08d", Integer.parseInt(IDstring));
			
			 Accountlist.get(i).setID(ID);
			
		}
		
	}
	
	public boolean IDisUnique(String newid)
	{
		
		for(int i=0;i<Accountlist.size();i++)
		{
			
			 
			if(Accountlist.get(i).getID().equals(newid))
			{
				
				
				return false;
			}
			
		}
	
		 
		return true;
	}
	
	public void setupUniqueUsernames()
	{
		String username;
		String lastname;
		String firstname;
		String ID;

		for(int i=0;i<Accountlist.size();i++)
		{
			firstname=Accountlist.get(i).getFirst_name();
			lastname=Accountlist.get(i).getLast_name();
			ID=Accountlist.get(i).getID();
			
			if(lastname.length()>3)
			{
				username=lastname.substring(0, 4);
			}
			else
			{
				username=lastname;
			}
		
			username=username+firstname.charAt(0);
			username=username+ID.charAt(ID.length()-1);

			 Accountlist.get(i).setUsername(username);;
			
		}
	}

	public void setupPasswords()
	{
		String password="no password assign";

		for(int i=0;i<Accountlist.size();i++)
		{
			password=createPassword();
			
			 Accountlist.get(i).setPassword(password);
			
		}
		
		
	}
	
	public String createPassword()
	{
		 int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength =8;
		    Random random = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    StringBuilder generatedString =new StringBuilder( buffer.toString());
		 //length of 5
		   int rand_index=(int) ((Math.random() * ((generatedString.length() - 1) + 1)) + 0);
		   char rand_Capital_Letter='d';
		   
		    rand_Capital_Letter=generatedString.charAt(rand_index);
		    rand_Capital_Letter= Character.toUpperCase(rand_Capital_Letter);
		    rand_index=(int) ((Math.random() * ((generatedString.length() - 1) + 1)) + 0);
		    
		    generatedString.setCharAt(rand_index,   rand_Capital_Letter);
		    
		    rand_index=(int) ((Math.random() * ((generatedString.length() - 1) + 1)) + 0);
		  
		   String Symbol="!$%&'()'*+,-./:;<=?@{}[]>";

		   generatedString.setCharAt(rand_index, Symbol.charAt((int) ((Math.random() * ((Symbol.length() - 1) + 1)) + 0)));
		  
		   
		
		    return generatedString.toString();
	}
	
	
	public void insertionSort() {
		int in;
		int out;
		
		for(out = 1; out< Accountlist.size(); out++) {
			Account temp = Accountlist.get(out);
			in = out;
			
			while(in > 0 && Accountlist.get(in - 1).getUsername().compareTo(temp.getUsername()) > 0)
			{
				Accountlist.set(in, Accountlist.get(in - 1));
			//	Accountlist.get(in)= Accountlist.get(in - 1);
				--in;
			}
			Accountlist.set(in, temp);
		}
	}
	
	//binarySearch
	public static boolean UsernameExist(Account[] list, Account key) 
	{
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;

			if (key.getUsername().compareTo(list[mid].getUsername())==-1)
			{
				high = mid - 1;
			} else if (key.getUsername().compareTo(list[mid].getUsername())==0) {
				return true;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
	
	//binarySearch
	public static boolean PasswordExist(Account[] list, Account key) 
	{
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;

			if (key.getPassword().compareTo(list[mid].getPassword())==-1)
			{
				high = mid - 1;
			} else if (key.getPassword().compareTo(list[mid].getPassword())==0) {
				return true;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}
