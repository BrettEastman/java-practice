package cs111b;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/20/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes chars userChar and currentChar, then initializes
         String userString and int count, defaulted to 0. It then gets the
         userChar by checking the first char of the input (which is a single char),
         followed by the userString which is the rest of the input. We use a for
         loop to iterate over each character in the user string, checking to see
         if it matches the userChar, and if so we increment the count. After the
         loop is completed, we print out the results, converting it to a plural
         output if the count is something other than one, followed by a new line.
*/

import java.util.Scanner;

public class LabProgram13 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        char userChar;
        char currentChar;
        String userString;
        int count = 0;

        userChar = scnr.next().charAt(0);
        userString = scnr.nextLine();

        for (int i = 0; i < userString.length(); i++) {
            currentChar = userString.charAt(i);
            if (currentChar == userChar) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("" + count + " " + userChar);
        } else {
            System.out.println("" + count + " " + userChar + "'s");
        }

    }
}
