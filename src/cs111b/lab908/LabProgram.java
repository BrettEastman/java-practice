package cs111b.lab908;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/10/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Add try/catch block to attempt to print the name of the user inputted index to
         the console. If that index is out of range, we then print a custom message using
         the getMessage method, then if the index is greater than the available range, we print
         out the last name in the array, otherwise we print out the first name.
*/

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
        int index;

        index = scnr.nextInt();

        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception! " + e.getMessage());
            if (index > names.length - 1) {
                System.out.println("The closest name is: " + names[names.length - 1]);
            } else {
                System.out.println("The closest name is: " + names[0]);
            }
        }
    }
}
