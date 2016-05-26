package com.Kenneth;

/**
 * Created by Kenneth on 5/25/2016.
 */
public class Mustang extends Car {

    private String modelPackage;

    public Mustang(String color, int doors, int cylinders, String model, String seatMaterail, String modelPackage) {
        super(color, doors, cylinders, model, seatMaterail);
        this.modelPackage = modelPackage;
    }

    public void speakerSystem() {
        System.out.println("BOOM!! BOOM!");
        super.changingGears("slow");
    }
}
