package cs111b;

/*
 Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/15/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes string firstName
         and prints "Hello firstName!" and "Welcome to zyBooks!"
*/

import java.util.Scanner;

public class LabProgram4 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String firstName;

        firstName = scnr.next();
        System.out.println("Hello " + firstName + "!");
        System.out.println("Welcome to zyBooks!");
    }
}
