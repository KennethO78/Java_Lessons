package com.Kenneth;

/**
 * Created by Kenneth on 5/26/2016.
 */
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //Reduce number of Lives reaming for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
