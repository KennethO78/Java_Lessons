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
        //
        // Create a hashtable and put some key-value pair.
        //
        // Get a random entry from the HashMap.
        //Object[] crunchifyKeys = companies.keySet().toArray();
        //Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
        //System.out.println("************ Random Value ************ \n" + key + " :: " + jokes.get(key));

//        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(jokes.entrySet());

        // Bonus Crunchify Tips: How to Shuffle a List??
        // Each time you get a different order...
//        System.out.println("\n************ Now Let's start shuffling list ************");
//        Collections.shuffle(list);
//        for (Map.Entry<String, String> entry : list) {
//        }
//            System.out.println(entry.getKey() + " : " + entry.getValue());


//        System.out.println(jokes.get("Whats red and bad for your teeth?"));
    }

    public void mapJokes() {

        // Bonus Crunchify Tips: How to Shuffle a List??
        // Each time you get a different order...
        System.out.println("\n************ Telling Joke Now ************");
        String setup = list.get(0).getKey();
        System.out.println(setup);
//        list = new ArrayList<Map.Entry<String, String>>(jokes.entrySet());

        String answer = input.next();

        try {
            Thread.sleep(2000);
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
        System.out.println("JOKES VLOADED");

        list = new ArrayList<Map.Entry<String, String>>(jokes.entrySet());
        Collections.shuffle(list);


    }
}


