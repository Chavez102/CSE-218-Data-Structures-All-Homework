package problem_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import problem_1.Name_Bag;
import problem_1.Name_Warehouse_class;

public class Methods {
	public static Object[] SortedGroupArray;
	
    public static ArrayList<String> get_names_with_(ArrayList<String> GroupArray,String first_letter_selection,String gender_selection)
    {
    	for(int i=0; i<Name_Warehouse_class.Bag.namelist.size();i++)
		 {

				 if (Name_Warehouse_class.Bag.namelist.get(i).getFirst_name().charAt(0)==first_letter_selection.charAt(0)&& 
						 Name_Warehouse_class.Bag.namelist.get(i).getGender().equals(gender_selection))
				 {
					 GroupArray.add(Name_Warehouse_class.Bag.namelist.get(i).getFirst_name()+" "+ 
							 		Name_Warehouse_class.Bag.namelist.get(i).getLast_name()+" ");
							 		
				 }
		}
    	return GroupArray;
    }
	
	
	public static void sortAlphabetically( ArrayList<String> GroupArray1)
	{
		   String temp;
		 
		   Object[] GroupArray = GroupArray1.toArray();
		   
			
        for ( int i = 0;  i < GroupArray.length - 1;  i++ )
        {
            for ( int j = i + 1;  j < GroupArray.length;  j++ )
            { 
            	if(((String) GroupArray[i]).compareToIgnoreCase((String) GroupArray[j])>0)
            	{
            		   temp = (String) GroupArray [ i ];
                       GroupArray [ i ] = GroupArray [ j ];    // swapping
                       GroupArray [ j ] = temp; 
            	}

            }
        }
 
        SortedGroupArray=GroupArray;
	
	}

	
	
	
	
    public static void write_to_newfile(String str,int filenum)
    {
    	//writing str to newfile
	   	filenum++;
	   	String file_name="file"+filenum+".txt";
	   	File file=new File(file_name);
	   	try {
			file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file_name));
		    writer.write(str);
		    writer.close();	
		} catch (IOException e) {e.printStackTrace();}
    }
}
