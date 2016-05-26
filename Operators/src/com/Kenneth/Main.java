package com.Kenneth;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " +result);

        int previosResult = result;

        result = result - 1;
        System.out.println(previosResult + " - 1 = " + result);

        previosResult = result;

        result = result * 10;
        System.out.println(previosResult + " * 10 =  "+ result);

        result = result / 5;
        System.out.println(previosResult + " / 5 =  "+ result);

        previosResult = result;
        result = result % 3;
        System.out.println(previosResult + " % 3 = " + result);

        previosResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less then 100");

        if ((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these test is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar);
        System.out.println("wasCar is true");



        double numbersD = 20d;
        double numberC = 80;
        double totalN = (numbersD + numberC) * 25;
        double totalS = totalN % 40;

        if(totalS <= 20)
            System.out.println("Total was over the limit");


    }
}
