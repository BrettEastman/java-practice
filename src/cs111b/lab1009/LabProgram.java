package cs111b.lab1009;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/14/2025
Instructor: David Harden
File Name: StatePair.java
Purpose: Defined readIntegerPair(), readDoublePair(), and readWordPair() by taking a scanner object as a parameter
         and returning a Pair object of Integer, Double, or String type. Read two values from input and return a
         Pair object with the input values in the same order.
*/

import java.util.Scanner;

public class LabProgram {
    public static Pair<Integer> readIntegerPair(Scanner scnr) {
        Integer val1 = scnr.nextInt();
        Integer val2 = scnr.nextInt();

        return new Pair<Integer>(val1, val2);
    }

    public static Pair<Double> readDoublePair(Scanner scnr) {
        Double val1 = scnr.nextDouble();
        Double val2 = scnr.nextDouble();

        return new Pair<Double>(val1, val2);
    }

    public static Pair<String> readWordPair(Scanner scnr) {
        String val1 = scnr.next();
        String val2 = scnr.next();

        return new Pair<String>(val1, val2);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pair<Integer> integerPair1 = readIntegerPair(scnr);
        Pair<Integer> integerPair2 = readIntegerPair(scnr);

        Pair<Double> doublePair1 = readDoublePair(scnr);
        Pair<Double> doublePair2 = readDoublePair(scnr);

        Pair<String> wordPair1 = readWordPair(scnr);
        Pair<String> wordPair2 = readWordPair(scnr);

        // output the two Pair objects separated by the character returned by
        // comparisonSymbol()
        System.out.print(integerPair1.toString());
        System.out.print(" " + integerPair1.comparisonSymbol(integerPair2) + " ");
        System.out.println(integerPair2.toString());

        System.out.print(doublePair1.toString());
        System.out.print(" " + doublePair1.comparisonSymbol(doublePair2) + " ");
        System.out.println(doublePair2.toString());

        System.out.print(wordPair1.toString());
        System.out.print(" " + wordPair1.comparisonSymbol(wordPair2) + " ");
        System.out.println(wordPair2.toString());
    }
}
