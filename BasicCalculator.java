package org.example;
import java.util.Scanner;
public class BasicCalculator {
    public static void useCalculator() {
        Scanner scanner = new Scanner(System.in);

        //First Number
        System.out.println("Enter the first number:");
        float firstNumber = scanner.nextFloat();

        //Second Number
        System.out.println("Enter the second number: ");
        float secondNumber= scanner.nextFloat();

        //Calculations
        System.out.println("\nPossible calculations: ");
        System.out.println(" Add ");
        System.out.println(" subtract ");
        System.out.println(" Multiply ");
        System.out.println(" Divide ");

        //Options
        System.out.println("Choose your option: ");
        char option = scanner.next() .charAt(0);

        //Multiplcation
        float results = firstNumber * secondNumber;


        System.out.println(firstNumber + " * " + secondNumber + " = ");
    }
}
