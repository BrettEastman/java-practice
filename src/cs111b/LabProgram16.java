package cs111b;

// Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Done", "done", or "d" for the line of text.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/20/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes String currentString in the main block.
         It then performs a while loop that will continue until the
         user breaks out of it by typing either "Done", "done", or "d".
         In the while loop, we initialize two new variables - a String
         which will be the current result of each iteration, along with
         the char currentChar. On each iteration of the while loop, we
         get the user to input text and assign it to currentString. If
         the string does not break the loop, we then conduct an inner
         for loop which goes through each character of the userString,
         in reverse, and adds it to the result. At the end of the for
         loop, we print out the result. The while loop continues until
         the user breaks out if it with the key strings mentioned above.
*/

import java.util.Scanner;

public class LabProgram16 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String currentString;

        while (true) {
            String result = "";
            char currentChar;
            currentString = scnr.nextLine();

            if ((currentString.equals("Done")) || (currentString.equals("done")) || (currentString.equals("d"))) {
                break;
            } else {
                for (int i = currentString.length() - 1; i >= 0; i--) {
                    currentChar = currentString.charAt(i);
                    result += currentChar;
                }
                System.out.println(result);
            }

        }
    }
}