package com.Kenneth;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*if(score == 5000);
        {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        }*/


        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final score was " + finalScore);
        }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
