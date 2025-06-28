package cs111b;

// Define a method named swapValues that takes an array of four integers as a parameter, swaps array elements at indices 0 and 1, and swaps array elements at indices 2 and 3. Then write a main program that reads four integers from input and stores the integers in an array in positions 0 to 3. The main program should call method swapValues() to swap array's values and print the swapped values on a single line separated with spaces.

// Ex: If the input is:

// 3 8 2 4
// method swapValues() returns and the main program outputs:

// 8 3 4 2
// The program must define and call a method:
// public static void swapValues(int[] values)

// Hint: Note the return type in the method declaration above.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/27/2025
Instructor: David Harden
File Name: LabProgram.java
Description: Program has a swapValues method which takes in an integer array, called values,
             which it modifies in place. The main program creates an integer constant called
             ARR_LENGTH set to 4, an integer array called inputArr which is initialized to
             ARR_LENGTH, and a string called result. We use a for loop to populate the array
             with user inputs. We then call swapValues on that input array. We then use another
             for loop to concatenate the string with the new array elements results. Then we
             print out that result.
*/

import java.util.Scanner;

public class LabProgram23 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int ARR_LENGTH = 4;
        int[] inputArr = new int[ARR_LENGTH];
        String result = "";

        for (int i = 0; i < ARR_LENGTH; ++i) {
            inputArr[i] = scnr.nextInt();
        }

        swapValues(inputArr);

        for (int i = 0; i < ARR_LENGTH; ++i) {
            result += inputArr[i];
            if (i != 3) {
                result += " ";
            }
        }

        System.out.println(result);
    }

    // This method creates an integer variable called tempVal, which it uses to
    // temporarily hold one of the values being swapped. Then proceeds to swap the
    // first and second elements then swap the third and fourth elements.
    public static void swapValues(int[] values) {
        int tempVal = values[0];
        values[0] = values[1];
        values[1] = tempVal;

        tempVal = values[2];
        values[2] = values[3];
        values[3] = tempVal;
    }
}
