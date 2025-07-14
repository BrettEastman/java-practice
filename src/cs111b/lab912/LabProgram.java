package cs111b.lab912;
/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/11/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: This program initializes the int max to the minimum possible number and we
create an int “count” which keeps a count of how many inputs we read. We use a try/catch
block so we can run the program, but also handle any NoSuchElementException’s and print
out the error messages requested by the prompt. Since we know the maximum number of inputs
is three and we have declared three ints, val1, val2, and val3, we get each input and
assign it to its variable, one at a time, each time checking to see if it is greater than
max, and incrementing the count. If we complete all three and do not have an exception
thrown, we print out the max value.
*/

import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int val1;
        int val2;
        int val3;
        int max = Integer.MIN_VALUE;
        int count = 0;

        val1 = 0;
        val2 = 0;
        val3 = 0;

        try {
            val1 = scnr.nextInt();
            max = val1;
            count++;

            val2 = scnr.nextInt();
            max = val2 > max ? val2 : max;
            count++;

            val3 = scnr.nextInt();
            max = val3 > max ? val3 : max;
            count++;

            System.out.println(max);
        } catch (NoSuchElementException excpt) {
            System.out.println(count + " input(s) read:");

            if (max != Integer.MIN_VALUE) {
                System.out.println("Max is " + max);
            } else {
                System.out.println("No max");
            }
        }
    }
}
