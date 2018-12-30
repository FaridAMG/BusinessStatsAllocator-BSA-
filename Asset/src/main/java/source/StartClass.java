package source;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


 

// Simple Hello World JavaFX program

public class StartClass extends Application {
    public static void main(String[] args) {

        launch(args);
        
        
        
    }

    // JavaFX entry point

    @Override

    public void start(Stage primaryStage) throws Exception {

       // A layout container for UI controls

        Parent root = FXMLLoader.load(getClass().getResource(System.getProperty("user.dir")+"/src/main/resources/HomePage.fxml"));
        Scene scene = new Scene(root,300,275);

        primaryStage.setTitle("Hello World!");

        primaryStage.setScene(scene);

        primaryStage.show();
        
        
        

    }

}
