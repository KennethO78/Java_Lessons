package com.Kenneth;

/**
 * Created by Kenneth on 6/1/2016.
 */
public abstract class Animal implements ICanFly{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
