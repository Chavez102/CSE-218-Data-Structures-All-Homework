package stack_and_queue_Array_Use;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUI_Controller
{
	Stack stack=new Stack(50);
	Queue queue=new Queue(50);

    @FXML
    private Button Insert_btn;
    @FXML
    private Button pop_btn;
    @FXML
    private Button push_btn;
    @FXML
    private Button remove_btn;
    @FXML
    private TextField Name_textfield;
    @FXML
    private TextField GPA_textfield;
    @FXML
    private TextArea left_textArea;
    
    @FXML
    private TextArea right_TextArea;
    
    @FXML
    void remove_btn_clicked(ActionEvent event) 
    {
	    if(!queue.isEmpty())
	    {
	    	
	    	if(queue.nElems>1)
	    	{
	    		queue.remove();
		     	displayFullQueue();
	    	}
	    	else
	    	{
	    		queue.clearQueue();
	    		right_TextArea.setText("");
	    	}
	    }
    	
    }

    @FXML
    public void insert_btn_clicked()
    {
    	Student newstudent=new Student(Name_textfield.getText().toString(),	//name
    			Double.parseDouble(GPA_textfield.getText().toString())		//double
    			);
    	queue.insert(newstudent);
    	displayFullQueue();
    }
    
    public void displayFullQueue() 
    {
    	
    	String str="";
		
		for(int i=queue.getFront();i<=queue.getRear();i++ )
		{
			str=str+queue.getQueArray()[i].getName()+
			String.format("%20s",queue.getQueArray()[i].getGPA())+
			String.format("%10s",queue.getQueArray()[i].getID())
    		+"\n";
			right_TextArea.setText(str);

		}
		
	}
    
	@FXML
    public void Push_btn_clicked() 
    {
    	Student newstudent=new Student(Name_textfield.getText().toString(),	//name
    			Double.parseDouble(GPA_textfield.getText().toString())		//double
    			);
    	stack.push(newstudent);
    	displayFullStack();
    }

    @FXML
    public void Pop_btn_clicked()
    {
    	
    	if(stack.gettop()>0)
    	{
    		
	    	stack.pop();
	    	displayFullStack();
    	}
    	else
    	{
    		stack.clearStack();
    		left_textArea.setText("");
    	}
    	
    }
    
    
    public void displayFullStack()
    {
    	int i=0;
    	String str="";
    	while(i-1<stack.gettop())
    	{
    		str=str+stack.get_stackArray()[i].getName()+
    				String.format("%20s",stack.get_stackArray()[i].getGPA())+
    				String.format("%10s",stack.get_stackArray()[i].getID())
    		+"\n";
    		
    		left_textArea.setText(str);
 
    		i++;
    	}
    	
    }
    
   

	
	
	
	
	
	
	

}
