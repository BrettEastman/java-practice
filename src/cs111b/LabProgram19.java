package cs111b;

// Write a program that first gets a list of integers from input. The input begins with an integer indicating the number of integers that follow. Then, get the last value from the input, which indicates a threshold. Output all integers less than or equal to that last threshold value. Assume that the list will always contain fewer than 20 integers.
// Ex: If the input is:
// 5 50 60 140 200 75 100
// the output is:
// 50,60,75,
// The 5 indicates that there are five integers in the list, namely 50, 60, 140, 200, and 75. The 100 indicates that the program should output all integers less than or equal to 100, so the program outputs 50, 60, and 75.
// For coding simplicity, follow every output value by a comma, including the last one.
// Such functionality is common on sites like Amazon, where a user can filter results.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/24/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes integer array, intList, which is an oversized array
         limited to 19 elements, along with ints listSize, threshold, and i.
         First we get the listSize from the first input, the we perform a for
         loop to insert the inputs into the intList array. After that, we assign
         the last input to threshold. Then we use another for loop to iterate
         through each item in the array to determine if it is within the threshold,
         and if so, we then print it out along with a comma.
*/

import java.util.Scanner;

public class LabProgram19 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] intList = new int[19];
        int listSize;
        int threshold;
        int i;

        listSize = scnr.nextInt();

        for (i = 0; i < listSize; ++i) {
            intList[i] = scnr.nextInt();
        }

        threshold = scnr.nextInt();

        for (i = 0; i < listSize; ++i) {
            if (intList[i] <= threshold) {
                System.out.print(intList[i] + ",");
            }
        }

        System.out.println("");
    }
}