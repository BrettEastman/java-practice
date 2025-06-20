package cs111b;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/20/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes Strings userString and result, as well as char currentChar.
         It gets the userString from the user's input, then it loops through every character
         to see if it is a letter, and if so, it concatenates it to result. In the end, it
         prints the result followed by a new line.
*/

import java.util.Scanner;

public class LabProgram14 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        String result = "";
        char currentChar;

        userString = scnr.nextLine();

        for (int i = 0; i < userString.length(); i++) {
            currentChar = userString.charAt(i);
            if (Character.isLetter(currentChar)) {
                result += currentChar;
            }
        }

        System.out.println(result);
    }
}