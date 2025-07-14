package cs111b.lab909;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/10/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program creates ints userNum and divNum. We then use a try block to first get
         userNum and divNum ints from user input, then print the quotient. If there
         is an Arithmetic exception, there is a catch block which will print out
         "Arithmetic Exception: " followed by the error message. If it is an input
         mismatch, there is a separate catch block which first prints "Input Mismatch
         Exception: " followed by the errors toString method result.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userNum;
        int divNum;

        try {
            userNum = scnr.nextInt();
            divNum = scnr.nextInt();
            System.out.println(userNum / divNum);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.print("Input Mismatch Exception: ");
            System.out.println(e.toString());
        }
    }
}
