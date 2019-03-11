package generic_Bag;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Main_Page_Controller implements Initializable{
	Generic_Bag_Class bag;
    @FXML
    private ChoiceBox<String> Type_Object_choicebox;
    @FXML
    private Button Find_Max_btn;
    @FXML private Button Find_Min_btn;
    @FXML private Button delete_Max_btn;
    @FXML private Button delete_Min_btn;
    @FXML private Button Insertion_Sort_btn;
    @FXML private Button Add_btn;
    @FXML private Button Display_btn;
    @FXML private TextField Type_Object_TextField;
    @FXML private Text Max_text;
    @FXML private Text Min_Text;
    @FXML private TextArea Output_TextArea;

    @FXML
    <T> void Add_btn_Pressed(ActionEvent event) 
    {
    	
    	if(Type_Object_choicebox.getValue().toString().equals("String")){
    		
    		String dData= Type_Object_TextField.getText();
    		bag.add(dData);
    	}
    	if(Type_Object_choicebox.getValue().toString().equals("Int")){
 
    		int dData= Integer.parseInt(Type_Object_TextField.getText());
    		bag.add(dData);	
    	}
    	if(Type_Object_choicebox.getValue().toString().equals("Double")){
    		double dData=Double.parseDouble(Type_Object_TextField.getText());
    		bag.add(dData);
    	}

    }

    @FXML
    void Delete_Min_btn_Pressed(ActionEvent event) {
    	bag.deleteMin();
    }

    @FXML
    void Display_btn_Pressed(ActionEvent event) {
    	
    	Output_TextArea.setText(bag.display());
    }

    @FXML
    <T> void Find_Max_btn_Pressed(ActionEvent event) {
    	T max=(T) bag.findMax();
    	Max_text.setText(max.toString());
    }

    @FXML
    <T> void Find_Min_btn_Pressed(ActionEvent event) {
    	T min=(T) bag.findMin();
    	Min_Text.setText(min.toString());
    }

    @FXML
    void Insertion_Sort_btn_Pressed(ActionEvent event) 
    {
    	bag.insertionSort();
    }

    @FXML
    void delete_Max_btn_Pressed(ActionEvent event) 
    {
    	bag.deleteMax();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		bag=new Generic_Bag_Class();

		
		Type_Object_choicebox.setValue("Int");

		Type_Object_choicebox.setItems(FXCollections.observableArrayList("String","Int","Double"));
	
		
	}
}