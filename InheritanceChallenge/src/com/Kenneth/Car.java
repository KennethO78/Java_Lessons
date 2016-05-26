package com.Kenneth;
/**
 * Created by Kenneth on 5/25/2016.
 */
public class Car extends Vehicle{

    private String model;
    private String seatMaterail;

    public Car(String color, int doors, int cylinders, String model, String seatMaterail) {
        super(color, doors, cylinders);
        this.model = model;
        this.seatMaterail = seatMaterail;
    }

    public void windowsTinted() {
        System.out.println("Car, looking dark");
        super.moving(110);
    }

    @Override
    public void steering(String steer) {
        System.out.println("Car.steering() called");
        super.steering(steer);
    }
}
