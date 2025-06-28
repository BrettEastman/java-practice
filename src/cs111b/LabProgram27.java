package cs111b;

// The Fibonacci sequence begins with 0 and then 1 follows. All subsequent values are the sum of the previous two, for example: 0, 1, 1, 2, 3, 5, 8, 13. Complete the fibonacci() method, which has an index, n (starting at 0), as a parameter and returns the nth value in the sequence. Any negative index values should return -1.

// Ex: If the input is:

// 7
// the output is:

// fibonacci(7) is 13

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/27/2025
Instructor: David Harden
File Name: LabProgram.java
Description: Program has a Fibonacci method which takes in an integer parameter
             index and returns and integer. The main program takes in the input
             integer from the user, which initializes the integer variable input.
             And the integer variable nthVal is created, then assigned to the result
             of calling the fibonacci() method with input as this argument. Then we
             print out the result.
*/

import java.util.Scanner;

public class LabProgram27 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();
        int nthVal;

        nthVal = fibonacci(input);

        System.out.println("fibonacci(" + input + ") is " + nthVal);
    }

    // The Fibonacci method initializes the variables, prevVal and currVal to zero
    // and one respectively. And we also create another integer variable tempVal. We
    // use a for loop starting on index one and going up to the integer argument in
    // index. In that for loop we use tempVal to save currVal, then we assigned
    // currVal the sum of currVal plus prevVal, then we assigned prevVal the
    // tempVal. At the end of the for loop we return currVal.
    public static int fibonacci(int index) {
        int prevVal = 0;
        int currVal = 1;
        int tempVal;

        if (index < 0) {
            return -1;
        } else if (index == 0) {
            return 0;
        } else {
            for (int i = 1; i < index; ++i) {
                tempVal = currVal;
                currVal = currVal + prevVal;
                prevVal = tempVal;
            }

            return currVal;
        }
    }
}
