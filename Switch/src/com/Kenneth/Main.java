package com.Kenneth;

public class Main {

    public static void main(String[] args) {
	/* int value = 1;
        if(value == 1) {
            System.out.println("value was 1");
        } else  if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("was a 3, or 4, or a 5");
                System.out.println("Actually is was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchEmi = 10;

        switch(switchEmi) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Letter A, B, C, D, E");
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }
}