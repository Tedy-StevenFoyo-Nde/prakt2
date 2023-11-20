package main;

import gui.BuergeraemterAnwendersystem;
import gui.BuergeraemterView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new BuergeraemterView(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
