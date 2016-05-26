package com.Kenneth;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);






        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", highScorePosition);

        HighScorePosition = calculateHighScorePosition4;
        displayHighScorePosition("Tem", highScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tolm", highScorePosition);

        HighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tum", highScorePosition);

    }

    public static void displayHighscorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "Managed to get into position"
        + highScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if() {
            int score >=1000;
            return 1;
        }
        else if () {
            playerScore >=500 && playerScore < 1000;
            return 2;
        }
        else if () {
            playerScore  >= 100 && playerScore < 500;
            return 3;
        }
        else{
            return 4;
        }


    }

    public static void calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
            return -1;


    }
}

