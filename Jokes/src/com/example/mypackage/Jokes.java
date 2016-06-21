package com.example.mypackage;

import java.util.*;

/**
 * Created by Kenneth on 6/6/2016.
 */
class Jokes {
    public HashMap<String, String> jokes = new HashMap<String, String>();
    public List<Map.Entry<String, String>> list;

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        }

    public void mapJokes() {

        System.out.println("\n************ Telling Joke Now ************");
        String setup = list.get(0).getKey(); // grabs the total number of jokes
        System.out.println(setup);


        String answer = input.next();

        try {
            Thread.sleep(2000); //This is just the waiting time for the joke to tell it after user input which is just 2 seconds
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(jokes.get(setup));

    }

    public void loadJokes() {

        jokes.put("Whats red and bad for your teeth?", "A brick.");
        jokes.put("Whats the hardest part of eating a vegetable?", "The wheelchair...");
        jokes.put("What did the robot say to the centipede", "Stop being a centipede!");
        jokes.put("What do you call a guy swimming in a pool with no arms or legs", "bob.");
        jokes.put("What do you get when you cross-breed a shark and a cow?", "I have no idea but I wouldn’t try milking it");
        jokes.put("What’s green, fuzzy and would kill you if it fell out of a tree?", "A pool table.");
        jokes.put("What day does the egg fear the most?", "Friday");
        jokes.put("What did the sea say to the sand?", "Nothing, it simply waved");
        jokes.put("Who said grapes are soft?", "They never cry when you step on them, they just let out a bit of wine");
        jokes.put("So, you're not afraid of ghost puns?", "That's the spirit!");
        jokes.put("What is the computer's favorite food?", "Microchips");
        jokes.put("I used to suffer from soap addiction, but..", "I'm clean now.");
        jokes.put("Do you know how they make holy water?", "They boil the hell out of it!");
        jokes.put("What would you call the child of a vampire and a snowman? ", "Frostbite.");
        System.out.println("JOKES LOADED");

        list = new ArrayList<Map.Entry<String, String>>(jokes.entrySet());
        Collections.shuffle(list);


    }
}




