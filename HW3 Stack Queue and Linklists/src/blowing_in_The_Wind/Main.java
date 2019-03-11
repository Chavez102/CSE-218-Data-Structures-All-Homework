package blowing_in_The_Wind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		Master_LinkList master_list=new Master_LinkList();
	String str="a b c a p b d";

	String filename="blowingInTheWind.txt";
	File file=new File(filename);

	str="";
	String string="";
	
	BufferedReader br = new BufferedReader(new FileReader(file));
	
	  while ((str = br.readLine()) != null) 
	  {
	 string=string+str;
	  } 

	
	String[] array;
	array=string.split(" ");
	String uniqueword="";
	String nextword="";

	for(int i=0;i<array.length-1;i++)
	{
		uniqueword=array[i];
		nextword=array[i+1];
		if(!master_list.findMasterLink(uniqueword))
		{
			master_list.insertFirst(uniqueword);
			master_list.first.babylinklist.insertFirst(nextword);
			
			//	master_list.first.babylinklist.insertFirst("please");
		}
		else if(master_list.findMasterLink(uniqueword))
		{
			master_list.gettheMasterLink(uniqueword).babylinklist.insertFirst(nextword);
		}

	}
	
	
	

	

	master_list.displayForward(); 

	//System.out.println(master_list.findMasterLink("six"));

	}

}
