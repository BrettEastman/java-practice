package general;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/18/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes totalChange, dollars, quarters, dimes, nickels, and pennies,
         then assigns totalChange the input, then, if totalChange is not zero, determines the number of each
         coin through integer division and the remaining change after removing
         larger coins first. Then it prints out a breakdown with the number of
         each coin in a string, which is plural if the number of that particular
         coin is something other than 1. Otherwise we return "No change".
*/

import java.util.Scanner;

public class LabProgram8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalChange;
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        totalChange = scnr.nextInt();

        if (totalChange != 0) {
            dollars = totalChange / 100;
            totalChange = totalChange % 100;

            quarters = totalChange / 25;
            totalChange = totalChange % 25;

            dimes = totalChange / 10;
            totalChange = totalChange % 10;

            nickels = totalChange / 5;

            pennies = totalChange % 5;

            if (dollars != 0) {
                System.out.println(dollars + " Dollar" + (dollars != 1 ? "s" : ""));
            }
            if (quarters != 0) {
                System.out.println(quarters + " Quarter" + (quarters != 1 ? "s" : ""));
            }
            if (dimes != 0) {
                System.out.println(dimes + " Dime" + (dimes != 1 ? "s" : ""));
            }
            if (nickels != 0) {
                System.out.println(nickels + " Nickel" + (nickels != 1 ? "s" : ""));
            }
            if (pennies != 0) {
                System.out.println(pennies + " Penn" + (pennies != 1 ? "ies" : "y"));
            }
        } else {
            System.out.println("No change");
        }
    }
}