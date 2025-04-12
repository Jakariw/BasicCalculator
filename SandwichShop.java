package org.example;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your sandwich size");
        System.out.println("1: FootLong ($14.50)");
        System.out.println("2: Limousine(Footlong + 6in) ($23.00)");
        System.out.println("Which sandwich do you prefer 1 or 2: ");
        int sandwichChoice = scanner.nextInt();

        double basePrice;
        if (sandwichChoice == 1) {
            basePrice = 14.50;
        } else if (sandwichChoice == 2) {
            basePrice = 23.00;
        } else{
            System.out.println("Invalid option, Select 1 or 2.");
            scanner.close();
            return;
        }
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }
        double finalPrice = basePrice * (1 - discount);
        System.out.printf("Your total is: $%.2f\n", finalPrice);


    }
}




