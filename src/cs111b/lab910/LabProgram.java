package cs111b.lab910;
/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/11/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: The method stepsToMiles takes in an integer, numSteps and throws an exception.
         First, we create a double variable steps. Then we check to see if steps is a negative
         number, and if so, we throw an exception with a message. We convert the argument,
         numSteps to a double type and assign steps to that value. And we return steps
         divided by 2000.
         The main method gets the integer number of steps from the user input. And we create
         a double variable stepMiles. We use a try catch block to call the stepsToMiles
         method on numSteps and assign that value to stepMiles. If that’s all good, then
         we print out the number rounded to two decimal places. If there is an exception
         thrown, it is caught by the catch block, and we print out the message from the
         exception.
*/

import java.util.Scanner;

public class LabProgram {
    public static double stepsToMiles(int numSteps) throws Exception {
        double steps;

        if (numSteps < 0) {
            throw new Exception("Exception: Negative step count entered.");
        }

        steps = (double) numSteps;
        return steps / 2000;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numOfSteps = scnr.nextInt();
        double stepMiles;

        try {
            stepMiles = stepsToMiles(numOfSteps);
            System.out.printf("%.2f", stepMiles);
            System.out.println("");
        } catch (Exception excpt) {
            System.out.println(excpt.getMessage());
        }
    }
}
