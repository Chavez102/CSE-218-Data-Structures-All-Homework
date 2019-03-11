package stack_and_queue_Linklist;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("GUI_page.fxml"));
				Scene scene = new Scene(root,600,600);
				primaryStage.setScene(scene);
				primaryStage.setTitle("LinkList Stack and Queue");
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void main(String[] args) {
			launch(args);
		}

	
	}
