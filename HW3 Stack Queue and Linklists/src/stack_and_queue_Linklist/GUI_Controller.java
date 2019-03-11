package stack_and_queue_Linklist;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUI_Controller
{
	Stack_Linklist stack=new Stack_Linklist();
	Queue_LinkList queue=new Queue_LinkList();
    @FXML private Button Insert_btn;
    @FXML private Button pop_btn;
    @FXML private Button push_btn;
    @FXML private Button remove_btn;
    @FXML private TextField Name_textfield;
    @FXML private TextField GPA_textfield;
    @FXML private TextArea left_textArea;
    @FXML private TextArea right_TextArea;
    
    
    @FXML
    void remove_btn_clicked(ActionEvent event) 
    {
    	if (!queue.isEmpty())
    	{
	    	
		    	queue.deleteLast();
		    	right_TextArea.setText(queue.getList());
    	}
    }

    @FXML
    public void insert_btn_clicked()
    {
    	Student newstudent=new Student(Name_textfield.getText().toString(),	//name
    			Double.parseDouble(GPA_textfield.getText().toString())		//double
    			);
    	
    	queue.insertFirst(newstudent);
    	
    	right_TextArea.setText(queue.getList());
    }

	@FXML
    public void Push_btn_clicked() 
    {

    	Student newstudent=new Student(Name_textfield.getText().toString(),	//name
    			Double.parseDouble(GPA_textfield.getText().toString())		//double
    			);
		stack.push(newstudent);
		left_textArea.setText(stack.getList());		
    }
   
    @FXML
    public void Pop_btn_clicked()
    {
    	if(!stack.isEmpty())
    	{
	    		stack.deleteLast();
				left_textArea.setText(stack.getList());	
    	}
    }
    
    
    

}
