package airport_Operation;



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
				Scene scene = new Scene(root,700,600);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Priority Flight");
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void main(String[] args) {
			launch(args);
		}
		
		
		
		

	
	}