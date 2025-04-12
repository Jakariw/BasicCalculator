package org.example;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Name?: ");
        String employeeName = Scanner.nextLine();

        System.out.println("Hours worked?: ");
        float hoursWorked = Scanner.nextFloat();

        System.out.println("What's your pay rate?: ");
        float payRate = Scanner.nextFloat();
        float grossPay = hoursWorked * payRate;

        System.out.println("\nPayroll Calculator: ");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Gross Pay: " + grossPay);


    }
}
