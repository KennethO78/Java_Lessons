package com.example.mypackage;

import java.util.*;

public class Main {
    Scanner input = new Scanner(System.in);
    Scanner punchLine = new Scanner(System.in);

    Jokes jokes = new Jokes();

    public static void main(String[] args) {

        Main main = new Main();
        Jokes jokes = new Jokes();

        main.startJoke();

    }



    public void startJoke() {
        jokes.loadJokes();
        System.out.println(jokes.list.size());
        for (int i = 0; i < jokes.list.size()   ; i++) {
            System.out.println("Wanna hear a joke?");
            System.out.println("Yes or No?");
            String answer = input.next();
            punchLine(answer, i); //calling punchLine here
        }

    }

    private void punchLine(String input, Integer jokeNumber) {
        if (input.equalsIgnoreCase("Yes")) {
            String setup = jokes.list.get(jokeNumber).getKey();
            System.out.println("\n************ Telling Joke Now ************");
            System.out.println(setup);
            try {
                Thread.sleep(2000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            String answer = punchLine.next();

            System.out.println(jokes.jokes.get(setup));


        } else if (input.equalsIgnoreCase("no")) {
            System.out.println("Shutting Down...");
            System.exit(0);
        }else {
            System.out.println("You must enter yes or no...");
        }
    }
}




