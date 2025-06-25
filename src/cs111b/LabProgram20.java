package cs111b;

// When analyzing data sets, such as data for human heights or for human weights, a common step is to adjust the data. This adjustment can be done by normalizing to values between 0 and 1, or throwing away outliers.
// For this program, adjust the values by dividing all values by the largest value. The input begins with an integer indicating the number of floating-point values that follow. Assume that the list will always contain fewer than 20 positive floating-point values.
// Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
// System.out.printf("%.2f", yourValue);
// Ex: If the input is:
// 5
// 30.0 50.0 10.0 100.0 65.0
// the output is:
// 0.30 0.50 0.10 1.00 0.65
// The 5 indicates that there are five floating-point values in the list, namely 30.0, 50.0, 10.0, 100.0, and 65.0. 100.0 is the largest value in the list, so each value is divided by 100.0.
// For coding simplicity, follow every output value by a space, including the last one.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/24/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes floating point array, floatList, limited to no larger
         than 19 items. It also initializes doubles currentFloat and largest, and
         integers numFloats and i. It then first gets the num floats from the first
         integer input, then it gets the first float input and assigns it to
         currentFloat, then assigns currentFloat to both largest, as well as to the
         first element in the floatList array. Once we have that, we iterate through
         the rest of the array (starting at index 1) to assign float inputs, as well
         as check to see which is largest and reassign largest if so. Once we have
         completed the first for loop, we reuse the i and currentFloat variables
         to divide each float in the array by the largest, then print it out, along
         with a space after each.
*/

import java.util.Scanner;

public class LabProgram20 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] floatList = new double[19];
        double currentFloat;
        int numFloats;
        double largest;
        int i;

        numFloats = scnr.nextInt();
        currentFloat = scnr.nextDouble();
        floatList[0] = currentFloat;
        largest = currentFloat;

        for (i = 1; i < numFloats; ++i) {
            currentFloat = scnr.nextDouble();
            if (currentFloat > largest) {
                largest = currentFloat;
            }
            floatList[i] = currentFloat;
        }

        for (i = 0; i < numFloats; ++i) {
            currentFloat = floatList[i] / largest;
            System.out.printf("%.2f", currentFloat);
            System.out.print(" ");
        }

        System.out.println("");
    }
}
