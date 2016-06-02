package com.Kenneth;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.pagesPrinted(4);
        System.out.println("Pages printed was " + pagesPrinted + " New total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.pagesPrinted(2);
        System.out.println("Pages printed was " + pagesPrinted + " New total print count for printer = " + printer.getPagesPrinted());
    }
}
