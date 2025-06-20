package cs111b;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/20/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes ints positiveInt, max, and count,
         and a double called average, all initialized to zero.
         It uses a special-value type while loop to continue
         while positiveInt is not negative, getting a new input
         upon each iteration. If it is negative, we break out
         of the loop. We increase the count each iteration and
         check each time to see if positiveInt is the new max.
         We keep a running tally of the total with average. After
         the loop is terminated, we calculate the average using
         the average total divided by the count. We print out
         the max, followed by a space, then the average up to
         two decimal places, followed by a new line.
*/

import java.util.Scanner;

public class LabProgram12 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int positiveInt = 0;
        int max = 0;
        int count = 0;
        double average = 0;

        while (positiveInt >= 0) {
            positiveInt = scnr.nextInt();
            if (positiveInt < 0) {
                break;
            }
            count++;
            if (positiveInt > max) {
                max = positiveInt;
            }
            average += positiveInt;
        }

        average = average / count;

        System.out.print(max + " ");
        System.out.printf("%.2f\n", average);
    }
}
