package com.Kenneth;

import java.util.Scanner;

public class Main {

    //public static void main(String[] args) {

        // int[] myIntArray = new int[25]; // = {1,2,3,4,5,6,7,8,9,10};
        /*myIntArray[5] = 50;
        double[] myDoubleArray = new double[5];
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);*/

       /* for (int i = 0; i <myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }

    }
    public static void printArray(int[] array) {
        for (int i = 0; i <array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }*/

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteregers = getIntegers(5);
        for(int i=0; i<myInteregers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myInteregers[i]);
        }
        System.out.println("The average is " + getAverage((myInteregers)));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return  (double) sum / (double)array.length;
    }
}
