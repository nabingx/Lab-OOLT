package Lab11.src.hust.soict.hedspi.gui.javafx.src.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication  extends Application {
   
 
    @Override
    public void start(Stage primaryStage) {
        try {
            // Read file fxml and draw interface.
            //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("MyScene.fxml"));

        	Parent root = FXMLLoader.load(getClass().getResource("MyScene.fxml"));
        	
            primaryStage.setTitle("My Application");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args) {
        launch(args);
    }
   
}
