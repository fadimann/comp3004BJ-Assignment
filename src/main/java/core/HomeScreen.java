package core;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HomeScreen extends Application{
	
	public void main(String[] args){
		launch(args); 
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane canvas = new Pane();
		//canvas.setStyle("-fx-background-color: green");
		
		Label label = new Label("Black Jack using JavaFX");
		label.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
		label.relocate(20, 20);
		canvas.getChildren().addAll(label);
		
		Scene scene = new Scene(canvas, 320, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Black Jack 2000");
		primaryStage.show();
	}

}
