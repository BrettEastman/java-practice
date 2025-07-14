package cs111b.lab1010;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/14/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Implemented inputIntegers, inputDoubles, and inputWords methods to each read 5 inputs
         from a user and store those inputs in an ArrayList of the given type, then return that
         ArrayList. Implemented print method to output the elements of the ArrayList. Also
         implemented getStatistics method which takes in an ArrayList creates a new one and
         stores the minimum, median and maximum values.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
    private static final int NUM_INPUTS = 5;

    // Input 5 Integers and return the Integers in an ArrayList
    public static ArrayList<Integer> inputIntegers(Scanner scnr) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < NUM_INPUTS; ++i) {
            result.add(scnr.nextInt());
        }

        return result;
    }

    // Input 5 Doubles and return the Doubles in an ArrayList
    public static ArrayList<Double> inputDoubles(Scanner scnr) {
        ArrayList<Double> result = new ArrayList<Double>();

        for (int i = 0; i < NUM_INPUTS; ++i) {
            result.add(scnr.nextDouble());
        }

        return result;
    }

    // Input 5 Strings, and return the Strings in an ArrayList
    public static ArrayList<String> inputWords(Scanner scnr) {
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < NUM_INPUTS; ++i) {
            result.add(scnr.next());
        }

        return result;
    }

    // Output the elements of the ArrayList parameter
    public static <TheType extends Comparable<TheType>> void print(ArrayList<TheType> list) {
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }

    // Return the min, median, and max of the ArrayList parameter in a new ArrayList
    public static <TheType extends Comparable<TheType>> ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
        ArrayList<TheType> sortedList = new ArrayList<TheType>(list);
        Collections.sort(sortedList);

        ArrayList<TheType> result = new ArrayList<TheType>();

        result.add(sortedList.get(0));
        result.add(sortedList.get(NUM_INPUTS / 2));
        result.add(sortedList.get(NUM_INPUTS - 1));

        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input a list of 5 Integers and print the ArrayList's statistics
        ArrayList<Integer> integers = inputIntegers(scnr);
        print(integers);
        ArrayList<Integer> integerStatistics = getStatistics(integers);
        print(integerStatistics);
        System.out.println();

        // Input a list of 5 Doubles and print the ArrayList's statistics
        ArrayList<Double> doubles = inputDoubles(scnr);
        print(doubles);
        ArrayList<Double> doubleStatistics = getStatistics(doubles);
        print(doubleStatistics);
        System.out.println();

        // Input a list of 5 words (Strings) and print the ArrayList's statistics
        ArrayList<String> words = inputWords(scnr);
        print(words);
        ArrayList<String> wordStatistics = getStatistics(words);
        print(wordStatistics);
    }
}
