package stack_and_queue_Array_Use;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;



	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("GUI_page.fxml"));
				Scene scene = new Scene(root,600,600);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Stack and Queue with Arrays");
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void main(String[] args) {
			launch(args);
		}

	
	}
