package com.Kenneth;
/**
 * Created by Kenneth on 5/25/2016.
 */
public class Vehicle {
    private String color;
    private int doors;
    private int cylinders;
    

public Vehicle(String color, int doors, int cylinders) {
    this.color = color;
    this.doors = doors;
    this.cylinders = cylinders;
}
    public void steering(String steer) {
        System.out.println("Car steers " + steer);
    }

    public void changingGears(String gears) {
        System.out.println("Car handle gears " + gears);
    }

    public void moving(int speed) {
        System.out.println("Car drives can reach this max speed " + speed);
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }
}
