package gui;



import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import Accounts.Account;
import Accounts.Account_bag;
import importing_Accounts_from_files.Import_main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Log_in_Controller implements  Initializable {

	@FXML
    private Text Hidden_text;
    @FXML
    private TextField username_textfield;

    @FXML
    private TextField password_textfield;

    @FXML
    private Button Log_in_btn;
    
    public void log_in_btn_clicked()
    {
    
    	
		 Account[] list=Import_main.Bag.Accountlist.toArray(new Account[Import_main.Bag.Accountlist.size()]);
		 
		 
		 Account key=new Account("Bryan","Chavez","Male");
	

	
		 key.setUsername(username_textfield.getText().toString());
	
		 System.out.println("username:"+Account_bag.UsernameExist(list, key));
		 

		
		 key.setPassword(password_textfield.getText().toString());
		 
		 System.out.println(Account_bag.PasswordExist(list, key));
		 if(Account_bag.UsernameExist(list, key)&&Account_bag.UsernameExist(list, key))
		 {
			 Hidden_text.setVisible(true);
			 System.out.println("Success!");
		 }
    	

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Import_main.createFullNames();//import all Accounts from files
	}
    
    
    
    
    

}
