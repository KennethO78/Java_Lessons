package com.example.mypackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



//for user events must add the implements below
public class Main extends Application  {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene two");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children are laid  out in vertical column
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout, 200, 200);

        //Button 2
        Button button2 = new Button("You will want to go back to scene one");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();
    }
}