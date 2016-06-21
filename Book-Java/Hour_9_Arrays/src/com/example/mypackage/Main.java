package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        //Code can be write two different ways, but one a better way of doing it
//        String string = "";
//        char[] mfl = mostFamous.toCharArray();
//        for (int dex =0; dex < mfl.length; dex++ ) {
//            char current = mfl [dex];
//            if (current != ' ') {
////                System.out.println(current);
//                string = string + "." + String.valueOf(current);
//            } else {
//                System.out.println('.');
//            }
//        }

            System.out.println(mostFamous.replace(" ", "."));
    }
}
