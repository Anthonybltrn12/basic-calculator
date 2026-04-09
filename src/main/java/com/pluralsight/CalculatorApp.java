package com.pluralsight;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = theScanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = theScanner.nextInt();

        theScanner.nextLine();
        int product = num1 * num2;
        System.out.println("The product of your 2 numbers is: " + product);


    }

}
