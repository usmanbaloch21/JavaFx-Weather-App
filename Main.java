package application;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
    
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    
	@Override
	public void start(Stage primaryStage) throws IOException {
	    //Declaring the Root for the application and passing the Home view file to the root
	        Parent root = FXMLLoader.load(getClass().getResource("WeatherView.fxml"));
	        
	        //setting the title of the stage
	        primaryStage.setTitle("Weather Forecast");
	       
	        //Setting the scene in the stage
	        primaryStage.setScene(new Scene(root));
	        
	        //this method shows the stage
	        primaryStage.show();
	        
	        
	        
	       
	}
	
	    
}
