package airport_Operation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class GUI_Controller implements Initializable
{
	Priority_Queue PriorityQ;

    @FXML
    private TextField Flight_num_textfield;
    @FXML
    private TextField Airline_Name_textfield;
    @FXML
    private TextField Landing_priority_textfield;
    @FXML
    private TextField time_Stamp_textfield;
    @FXML
    private Button Add_Flight_btn;
    @FXML
    private TextArea TextArea;
    
    @FXML
    void Add_Flight_btn_Pressed(ActionEvent event) 
    {
    	Flight newflight=new Flight(
    			Integer.parseInt(Landing_priority_textfield.getText().toString()),
    			time_Stamp_textfield.getText().toString(),
    			Airline_Name_textfield.getText().toString(),
    			Integer.parseInt(Flight_num_textfield.getText().toString())   );

    	PriorityQ.insert(newflight);

    	TextArea.setText(displayQ());
    	
    }
    
	public String displayQ()
	{
		int tempnElems=PriorityQ.getnElems();
		String str="";
		while(!PriorityQ.isEmpty())
		{
			
			Flight item=PriorityQ.remove();
			str=str+
			String.format("%10s",item.getFlight_num())+" "+
			String.format("%35s",item.getAirline_Name())+" "+
			String.format("%30s",item.getTime_Stamp())+" "+
			String.format("%30s",item.getLanding_Priority_level())+"\n";
		}
		PriorityQ.setElems(tempnElems);
		return str;
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		PriorityQ=new Priority_Queue(50);
		
	}

}
