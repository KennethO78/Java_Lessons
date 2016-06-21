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
import java.util.*;



//for user events must add the implements below
public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    Jokes jokes = new Jokes();

    public static void main(String[] args) {
        launch(args);

        Main main = new Main();
        Jokes jokes = new Jokes();

        main.startJoke();
    }


    public void startJoke() {
        jokes.loadJokes();
        System.out.println(jokes.list.size());
        for (int i = 0; i < jokes.list.size(); i++) {
            System.out.println("Wanna hear a joke?");
            System.out.println("Yes or No?");
            String answer = input.next();
            input2(answer, i); //calling input2 here
        }

    }

    private void input2(String input, Integer jokeNumber) {
        if (input.equalsIgnoreCase("Yes")) {
            String setup = jokes.list.get(jokeNumber).getKey();
            System.out.println("\n************ Telling Joke Now ************");
            System.out.println(setup);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            String answer = input2.next();

            System.out.println(jokes.jokes.get(setup));

        } else if (input.equalsIgnoreCase("no")) {
            System.out.println("Shutting Down...");
            System.exit(0);
        } else {
            System.out.println("You must enter yes or no...");
        }

        @Override
        public void start (Stage primaryStage)throws Exception {
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
}