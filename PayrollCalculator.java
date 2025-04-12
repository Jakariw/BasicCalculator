package org.example;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String employeeName = getEmployeeName(scanner);
        float hoursWorked = getHoursWorked(scanner);
        float payRate = getPayRate(scanner);

        float grossPay = calculateGrossPay(hoursWorked, payRate);
        printPayrollInfo(employeeName, grossPay);

        scanner.close();
    }       
       
 public static String getEmployeeName(Scanner scanner) {
     System.out.println("Name?: ");
     return scanner.nextLine();
 }
public static float getHoursWorked(Scanner scanner) {
    System.out.println("Hours worked?: ");
    return scanner.nextFloat();
}

public static float getPayRate(Scanner scanner) {
    System.out.println("What's your pay rate?: ");
    return scanner.nextFloat();
}

public static float calculateGrossPay ( float hoursWorked, float payRate){
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            return (40 * payRate) + (overtimeHours * payRate * 1.5f);
        } else {
                return hoursWorked * payRate;
            }
        }
public static void printPayrollInfo(String name, float grossPay) {
        System.out.println("\nPayroll Calculator: ");
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: " + String.format("%.2f", grossPay));

    }
}
