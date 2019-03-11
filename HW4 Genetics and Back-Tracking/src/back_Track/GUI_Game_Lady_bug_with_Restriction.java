package back_Track;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI_Game_Lady_bug_with_Restriction extends Application {

	Stack stack=new Stack();
	public static int btn_num = 1;
	static Button[] btn = new Button[101];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		}
		 
		@Override
		public void start(Stage primaryStage) throws Exception {
			int x=1;

			GridPane grid = new GridPane();

			Image blankimage = new Image(getClass().getResourceAsStream("cc0949.jpg"));
			Image lady_bug_image = new Image(getClass().getResourceAsStream("download.jpg"));
			
			
			
			
			for (x = 1; x < 101; x++) {
				ImageView imageView_test=new ImageView(blankimage);
				imageView_test.setFitHeight(80);
				imageView_test.setFitWidth(80);
				btn[x] = new Button();
				btn[x].setGraphic(imageView_test);	
			}
			
			
			
			for (int y2 = 1; y2 < 11; y2++) 
			{
				for (x = 1; x < 11; x++) 
				{
					final int final_btn_num = btn_num;
					btn[btn_num].setOnAction(new EventHandler<ActionEvent>() 
					{
						@Override
						public void handle(ActionEvent event) 
						{ 
						ImageView imageView_blankpic=new ImageView(blankimage);
						imageView_blankpic.setFitHeight(80);
						imageView_blankpic.setFitWidth(80);
						
						
						ImageView imageView_LadyBug = new ImageView(lady_bug_image);
						imageView_LadyBug.setFitHeight(80);
						imageView_LadyBug.setFitWidth(80);
						
						
						
						if( stack.isEmpty()	   			   ||
							final_btn_num==stack.peek()-11 ||	//top left
							final_btn_num==stack.peek()-10 ||	//top
							final_btn_num==stack.peek()-9  ||	//top_right
							final_btn_num==stack.peek()-1  || 	//left
							final_btn_num==stack.peek()+1  || 	//right
							final_btn_num==stack.peek()+9  || 	//bottom left
							final_btn_num==stack.peek()+10 || 	//bottom
							final_btn_num==stack.peek()+11  	//bottom right
								)
						{
						stack.push(final_btn_num);
						btn[(int) stack.SecondtoLast()].setGraphic(imageView_blankpic);
						btn[final_btn_num].setGraphic(imageView_LadyBug);
						}
						else
						{
							System.out.println("Error");
						}
						
						}});
					
					grid.add(btn[btn_num], x, y2);				
					btn_num++;
				}
			}
			
			Button Undo_btn=new Button("Undo");
			Undo_btn.setOnAction(new EventHandler<ActionEvent>() 
					{
						@Override
						public void handle(ActionEvent event) 
						{ 
							ImageView imageView_blankpic=new ImageView(blankimage);
							imageView_blankpic.setFitHeight(80);
							imageView_blankpic.setFitWidth(80);
							
							ImageView imageView_LadyBug = new ImageView(lady_bug_image);
							imageView_LadyBug.setFitHeight(80);
							imageView_LadyBug.setFitWidth(80);
							btn[(int) stack.peek()].setGraphic(imageView_blankpic);
							
							stack.pop();
							btn[(int) stack.peek()].setGraphic(imageView_LadyBug);
							
						}});
			
			
			grid.add(Undo_btn, 1,11 );
				
			Scene scene= new Scene(grid, 1000, 1000);
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}


}
