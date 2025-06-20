package cs111b;

// Write a program whose input is two integers, and whose output is the first integer and subsequent increments of 5 as long as the value is less than or equal to the second integer.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/20/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes ints firstInt and secondInt, and the String result.
         It assigns the ints to the user inputs, then it performs and if/else
         check to see if the secondInt is less than the firstInt, and if so,
         it returns a cautionary message (error message) indicating that the
         second integer can't be less than the first. Otherwise if the inputs
         are aligned with expectations, we perform a while loop which continues
         while firstInt is less than or equal to secondInt. On each iteration,
         we reassign the int "firstInt" as firstInt plus 5, while also adding
         it to the result. In the end, we return the result followed by a new line.
*/

import java.util.Scanner;

public class LabProgram15 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int firstInt;
        int secondInt;
        String result = "";

        firstInt = scnr.nextInt();
        secondInt = scnr.nextInt();

        if (secondInt < firstInt) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            while (firstInt <= secondInt) {
                result += firstInt + " ";
                firstInt += 5;
            }
            System.out.println(result);
        }
    }
}