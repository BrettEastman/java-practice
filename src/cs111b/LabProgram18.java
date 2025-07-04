package cs111b;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/03/2025 (update to remove "while true" loop)
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes integer array, sortedArray, which is an oversized array
         limited to 9 elements, along with ints currentInt, halfway, and i.
         It then performs a while loop to check if the current input
         integer is -1, which would mean the end of the user inputs therefore we
         would break out of the loop. Otherwise, it checks to see if we have 9 or
         more inputs, which means we need to break and print "Too many numbers".
         Otherwise, we can go ahead and insert the inputs into the array in the
         order in which they are received. After that, we assign the size of the
         array divided by two to the int halfway. Then we use that index to print
         out the middle item.
*/

import java.util.Scanner;

public class LabProgram18 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] sortedArray = new int[9];
        int currentInt;
        int halfway;
        int i = -1;
        boolean tooMany = false;

        currentInt = scnr.nextInt();

        while (currentInt != -1 && !tooMany) {
            i++;
            if (i == 9) {
                tooMany = true;
            } else {
                sortedArray[i] = currentInt;
            }
            currentInt = scnr.nextInt();
        }

        if (tooMany) {
            System.out.println("Too many numbers");
        } else {
            halfway = i / 2;
            System.out.println("Middle item: " + sortedArray[halfway]);
        }
    }
}