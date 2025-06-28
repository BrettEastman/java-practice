package cs111b;

// Define a method named sortArray that takes an array of integers and the number of elements in the array as parameters. Method sortArray() modifies the array parameter by sorting the elements in descending order (highest to lowest). Then write a main program that reads a list of integers from input, stores the integers (starting from the second integer) in an array, calls sortArray(), and outputs the sorted array. The first input integer indicates how many numbers are in the list. Assume that the list will always contain less than 20 integers.

// Ex: If the input is:

// 5 10 4 39 12 2
// the output is:

// 39,12,10,4,2,
// For coding simplicity, follow every output value by a comma, including the last one.

// Your program must define and call the following method:
// public static void sortArray(int[] myArr, int arrSize)

// Hint: Sorting an array can be done in many ways. You are welcome to look up and use any existing algorithm. Some believe the simplest to code is bubble sort: Bubble sort Wikipedia article. But you are welcome to try others: Sorting algorithm Wikipedia article.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/27/2025
Instructor: David Harden
File Name: LabProgram.java
Description: Program has a sortArray method, which sorts an array in place. The
             main program creates and initializes the integer numElements to the
             first input from the user, and it initializes an integer array inputArr
             to the size numElements. We also create a string variable result. Then
             we use a for loop to populate the array with the user inputs. After
             that we call the sortArray method with input our and numElements as
             arguments. Then we use another for loop to concatenate the result
             string with the sorted array elements followed by a comma. Then we
             print out the result.
*/

import java.util.Scanner;

public class LabProgram25 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElements = scnr.nextInt();
        int[] inputArr = new int[numElements];
        String result = "";

        for (int i = 0; i < numElements; ++i) {
            inputArr[i] = scnr.nextInt();
        }

        sortArray(inputArr, numElements);

        for (int i = 0; i < numElements; ++i) {
            result += inputArr[i];
            result += ",";
        }

        System.out.println(result);
    }

    // The sortArray method uses the bubble sort algorithm. It modifies the array in
    // place using two for loops. The outer four loop iterates through the array in
    // reverse up to, but not including the first index. The inner for loop iterates
    // from the beginning of the array up to the element just before the ice index.
    // Then we compare neighboring elements to see which one is lesser of the two,
    // and if needed we swap the two so that the lower number comes first.
    public static void sortArray(int[] myArr, int arrSize) {
        int tempVal;

        for (int i = arrSize - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (myArr[j] < myArr[j + 1]) {
                    tempVal = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = tempVal;
                }
            }
        }
    }
}
