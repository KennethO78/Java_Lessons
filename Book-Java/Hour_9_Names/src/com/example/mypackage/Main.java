package com.example.mypackage;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String names [] = {"Tom", "Rick", "Betty", "Jordan", "Sally", "Big Joe"};
        System.out.println("The origin order");

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();

        Arrays.sort(names);
        System.out.println("The new order");
        for (int i = 0; i < names.length; i++ ) {
            System.out.println(i + ": " + names[i] );
        }
        System.out.println();
    }
}
