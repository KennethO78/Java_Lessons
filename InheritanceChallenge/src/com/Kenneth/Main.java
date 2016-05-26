package com.Kenneth;

import java.lang.invoke.MutableCallSite;

public class Main  {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("color", 2, 6);

        Car myCar = new Car("cyan", 2, 6, "Mustang", "leather");

        Mustang myMustang = new Mustang("cyan", 2, 6, "Ford", "leather", "Cobra");

        myVehicle.changingGears("Automatic");
        myCar.steering("Turn harder");
        myCar.windowsTinted();
        myMustang.speakerSystem();

    }
}
