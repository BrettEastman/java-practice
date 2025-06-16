package general;

/*
 Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/15/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes 3 integers representing nickels, dimes, and quarters,
         then prompts user to enter input for number of each coin, then calculates the total value of the coins in cents.
*/

import java.util.Scanner;

public class LabProgram5 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int nickels;
        int dimes;
        int quarters;
        int totalCents;
        double totalDollars;

        nickels = scnr.nextInt();
        dimes = scnr.nextInt();
        quarters = scnr.nextInt();

        totalCents = (nickels * 5) + (dimes * 10) + (quarters * 25);
        totalDollars = totalCents / 100.0;

        System.out.print("Amount: $");
        System.out.printf("%.2f", totalDollars);
    }
}
