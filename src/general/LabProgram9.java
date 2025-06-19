package general;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/18/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes year, then assigns year to user input,
         then we check to see if the remainer after diving the year
         by 4 is equal to zero and whether or not it is a century.
         If both, we print that it is a leap year if divisible by 400,
         then we check if it is a regular leap year (not a century)
         and print if it is and if not we print that it is not a leap
         year, then print a new line.
*/

import java.util.Scanner;

public class LabProgram9 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int year;

        year = scnr.nextInt();

        if ((year % 4 == 0) && (year % 100 == 0)) {
            if (year % 400 == 0) {
                System.out.println(year + " - leap year");
            } else {
                System.out.println(year + " - not a leap year");
            }
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " - leap year");
        } else {
            System.out.println(year + " - not a leap year");
        }
    }
}
