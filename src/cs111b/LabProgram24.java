package cs111b;

// Define a method named coinFlip that takes a Random object and returns "Heads" or "Tails" according to a random value 1 or 0. Assume the value 1 represents "Heads" and 0 represents "Tails". Then, write a main program that reads the desired number of coin flips as an input, calls method coinFlip() repeatedly according to the number of coin flips, and outputs the results. Assume the input is a value greater than 0.

// Ex: If the random object is created with a seed value of 2 and the input is:

// 3
// the output is:

// Heads
// Tails
// Heads
// Note: For testing purposes, a Random object is created in the main() method using a pseudo-random number generator with a fixed seed value. The program uses a seed value of 2 during development, but when submitted, a different seed value may be used for each test case.

// The program must define and call the following method:
// public static String coinFlip(Random rand)

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/27/2025
Instructor: David Harden
File Name: LabProgram.java
Description: Program has a coinFlip method which chooses either 0 or 1 randomly
             and outputs a string with either "Heads" or "Tails". The main program
             imports both Scanner and Random, creating two variables scnr and rndm
             initialized to those objects. It also creates an integer variable called
             numFlips which it gets from the user input. We then use a for loop to
             call the coinFlip method for the number of times that numFlips has
             determined, and we print out the result on each iteration..
*/

import java.util.Scanner;
import java.util.Random;

public class LabProgram24 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rndm = new Random();
        int numFlips;

        numFlips = scnr.nextInt();

        for (int i = 0; i < numFlips; ++i) {
            System.out.println(coinFlip(rndm));
        }
    }

    // The coin flip method takes in a Random object, and it returns a String. The
    // method initializes two constant variables, HEADS and TAILS, as well as an
    // integer result, which calls the random object nextInt() property to get a
    // random number that is either zero or one. We then use a conditional
    // expression to return a string according to which random number was chosen.
    public static String coinFlip(Random rndm) {
        final String HEADS = "Heads";
        final String TAILS = "Tails";
        int result = rndm.nextInt(2);

        return result == 1 ? HEADS : TAILS;
    }
}
