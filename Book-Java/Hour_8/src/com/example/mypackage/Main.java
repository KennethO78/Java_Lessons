package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
//        for (int dex = 1; dex <= 200; dex++) {
//            int multiple = 9 * dex;
//            System.out.println(multiple + " ");
//        }
//        System.out.println();

        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) {
            for (int i = 0; i < target; i++) {
                if (points > 50) {
                    break targetLoop;
                }
                points = points + i;
            }
            System.out.println();
        }
    }
}
