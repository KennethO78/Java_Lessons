package com.Kenneth;

/**
 * Created by Kenneth on 5/26/2016.
 */
public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0) {
            System.out.println("Player knocked out");
            //Reduce number of Lives reaming for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
