package org.example;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("What date do you prefer to pickup?: ");
        String pickupDate = scanner.nextLine();
        System.out.println("How many days are you renting for?: ");
        int daysRented = Integer.parseInt(scanner.nextLine());
        System.out.println("Would you like an electronic toll tag at $3.95/day (yes/no): ");
        boolean tollTag = scanner.nextLine().equalsIgnoreCase("yes");
        System.out.println("Would you like to add on GPS ($2.95/day)? (yes/no): ");
        boolean gps = scanner.nextLine().equalsIgnoreCase("yes");
        System.out.println("Would you like to also add roadside assistance ($3.95/day)? (yes/no): ");
        boolean roadsideAssistance = scanner.nextLine().equalsIgnoreCase("yes");
        System.out.println("What is your age: ");
        int age = Integer.parseInt(scanner.nextLine());


        double baseRate = 29.99;
        double tollRate = 3.95;
        double gpsRate = 2.95;
        double roadsideAssistanceRate =3.95;
        double baseCost = baseRate * daysRented;
        double optionCost = 0;



        if (tollTag) optionCost += tollRate * daysRented;
        if (gps) optionCost += gpsRate * daysRented;
        if (roadsideAssistance) optionCost += roadsideAssistanceRate * daysRented;

        double surcharge = 0;
        if (age < 25) {
            surcharge = baseCost *0.30;
        }

        double totalCost = baseCost + optionCost + surcharge;

        System.out.println("\nRental Car Summary: ");
        System.out.printf("Pickup Date: %s\n", pickupDate);
        System.out.printf("Base Rental Cost: $%.2f\n", baseCost);
        System.out.printf("Option Cost: $%.2f\n", optionCost);
        System.out.printf("Underage Surcharge: $%.2f\n", surcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
    }
}