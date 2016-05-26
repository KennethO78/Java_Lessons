package com.Kenneth;

/**
 * Created by Kenneth on 5/25/2016.
 */
public class Car extends  Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
