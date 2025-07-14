package cs111b.lab907;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/10/2025
Instructor: David Harden
File Name: NameAgeChecker.java
Purpose: Add try/catch block in while loop to catch any InputMismatchException errors.
         If error is caught, we call scnr.nextLine() to skip the rest and we print
         out the inputName with the age as 0.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            try {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));
            } catch (InputMismatchException excpt) {
                scnr.nextLine();
                System.out.println(inputName + " " + 0);
            }

            inputName = scnr.next();
        }
    }
}