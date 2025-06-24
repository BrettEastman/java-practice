package cs111b;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/24/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes integers numInt and i, and an array of integers, intArr.
         It then gets the number of Integers from the first input and assigns it to
         numInt, then proceeds to get the rest of the array elements from input.
         Once we have the array filled, we perform a reverse for loop to output each
         element followed by a comma.
*/

import java.util.Scanner;

public class LabProgram17 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInt;
        int[] intArr;
        int i;

        numInt = scnr.nextInt();

        intArr = new int[numInt];

        for (i = 0; i < numInt; ++i) {
            intArr[i] = scnr.nextInt();
        }

        for (i = numInt - 1; i >= 0; --i) {
            System.out.print(intArr[i] + ",");
        }

        System.out.println("");
    }
}