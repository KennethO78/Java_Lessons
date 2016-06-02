package com.Kenneth;

/**
 * Created by Kenneth on 5/26/2016.
 */
public class Lamp {
    private String sytle;
    private boolean battery;
    private int globRating;

    public Lamp(String sytle, boolean battery, int globRating) {
        this.sytle = sytle;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning On");
    }

    public String getSytle() {
        return sytle;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
