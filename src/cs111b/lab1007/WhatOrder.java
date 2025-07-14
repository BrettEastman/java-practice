package cs111b.lab1007;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/14/2025
Instructor: David Harden
File Name: WhatOrder.java
Purpose: This program implements the checkOrder method in the WhatOrder class. We are taking in
         a generic type "T" that inherits the methods of the Comparable type. The program takes
         in four arguments - scnr1, scnr2, scnr3, scnr4. The program returns an int. We create
         four final ints - NUM_INPUTS, IS_NEITHER, IS_ASC, IS_DESC. We create two booleans to
         keep track of whether the inputs will be in either descending or ascending order. And
         we create an ArrayList with items of the generic type, called currentInputs. We add
         the user inputs manually, then a for loop cycles through currentInputs using the
         compareTo method to determine if the items are not in ascending or descending order. In
         the end we use an if statment to return the correct int indicating that the items were
         ascending, descending, or neither.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class WhatOrder {
    public static <T extends Comparable> int checkOrder(T scnr1, T scnr2, T scnr3, T scnr4) {
        final int NUM_INPUTS = 4;
        final int IS_NEITHER = 0;
        final int IS_ASC = -1;
        final int IS_DESC = 1;
        boolean isAscending = true;
        boolean isDescending = true;
        ArrayList<T> currentInputs = new ArrayList<T>();

        currentInputs.add(scnr1);
        currentInputs.add(scnr2);
        currentInputs.add(scnr3);
        currentInputs.add(scnr4);

        for (int i = 0; i < NUM_INPUTS - 1; ++i) {
            if (currentInputs.get(i).compareTo(currentInputs.get(i + 1)) > 0) {
                isAscending = false;
            }
            if (currentInputs.get(i).compareTo(currentInputs.get(i + 1)) < 0) {
                isDescending = false;
            }
        }

        if (isAscending) {
            return IS_ASC;
        } else if (isDescending) {
            return IS_DESC;
        } else {
            return IS_NEITHER;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Check order of four strings
        System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

        // Check order of four doubles
        System.out.println(
                "Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
    }
}
