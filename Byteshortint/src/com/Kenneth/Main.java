package com.Kenneth;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
	    int myMinValue= -2_147_483_648;
        int myMaxValue= 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = -32767;
        short myNewShortVaslue = (short) (myShortValue);

        //has a width of 64
        long myLongValue = 9223372036854775807L;


        byte myCoolNumberValue = 5;
        short mySweetNumberValue = 5000;
        int myLameNumberValue = 3;

        long longTotal = 50000 + 10 * (myCoolNumberValue + mySweetNumberValue + myLameNumberValue);
        System.out.println("longTotal = " + longTotal);




    }
}
