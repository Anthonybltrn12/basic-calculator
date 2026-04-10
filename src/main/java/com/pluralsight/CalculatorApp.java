package com.pluralsight;
import java.util.Scanner;
import java.util.Objects;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = theScanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = theScanner.nextInt();

        theScanner.nextLine();

        System.out.println("Enter the letter of the operation you want (A,S,D,M) : ");
        String mathOp = theScanner.nextLine();

        int product = num1 * num2;
        int divide = num1 / num2;
        int addNum = num1 + num2;
        int subNum = num1 - num2;



        if (Objects.equals(mathOp, "m")){
            System.out.printf("The product of your numbers is: %d ", product);
        } else if (Objects.equals(mathOp, "d")){
            System.out.println("The quotient of your number is: " + divide);
        } else if (Objects.equals(mathOp, "a")){
            System.out.println("The sum of your numbers is: " + addNum);
        } else if (Objects.equals(mathOp, "s") ){
            System.out.println("THe difference of your numbers is: " + subNum);
        }



    }

}
