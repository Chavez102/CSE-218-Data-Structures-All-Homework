package problem_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import problem_1.Name_Warehouse_class;
//Problem 2 with GUI
public class Main_Controller implements Initializable
{
	private String str="";
	int filenum=0;
	 @FXML
	    private TextArea TextArea_textarea;

	    @FXML
	    private TextField first_letter_textField;

	    @FXML
	    private ChoiceBox<String> gender_choicebox;

	    @FXML
	    private Button Search_btn;
	    @FXML
	    public static ArrayList<String> GroupArray=new ArrayList<>();


	    @FXML
	    void Search_btn_clicked(ActionEvent event) throws FileNotFoundException 
	    {
	    	String gender_selection=gender_choicebox.getValue();	    	
	    	String first_letter_selection= first_letter_textField.getText().toString();
		   	GroupArray=Methods.get_names_with_(GroupArray, first_letter_selection, gender_selection);
		   	 
		   	Methods.sortAlphabetically(GroupArray);
	
		   	for ( int i = 0;  i < GroupArray.size() ;  i++ )
		   		str= str+(i+1)+"."+Methods.SortedGroupArray[i]+"\n";
		   	
		   	Methods.write_to_newfile(str,0);
		   	TextArea_textarea.setText(str);	
		   	
		   	//Reset
		   	str="";
		   	GroupArray.clear();
		   	Methods.SortedGroupArray=GroupArray.toArray();

	    }
	    

		@Override
		public void initialize(URL location, ResourceBundle resources) 
		{
		  	 try {
				Name_Warehouse_class.createFullNames();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    	gender_choicebox.setValue("Male");

	    	gender_choicebox.setItems(FXCollections.observableArrayList("Male","Female"));
			
		}

}
