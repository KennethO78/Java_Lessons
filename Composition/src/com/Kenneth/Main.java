package com.Kenneth;

public class Main {

    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20, 20, 5);
	    Case theCase = new Case("22AB", "Acer", "240", dimensions);

        Monitor theMonitor = new Monitor("27ich Beast", "Dell", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-280", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1150, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
