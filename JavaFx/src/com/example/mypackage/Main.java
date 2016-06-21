package com.example.mypackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



                                                //for user events must add the implements below
public class Main extends Application /*implements EventHandler<ActionEvent>*/ {

    Button button;

    public static void main(String[] args) {
        launch(args); // The app starts here then this will go into application and set up the javafx
    }

    @Override //after it goes to application it will call start
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window");

        button = new Button();
        button.setText("Click me");

        //this class will handle the button events
        button.setOnAction(e -> System.out.println("Hey now brown cow"));



        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250); //size and layout of the program
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
