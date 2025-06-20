package cs111b;

/*
 Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/15/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program reads integers age, weight, heartRate, and time,
         initializes caloriesBurned, then assigns calculation to it,
         then outputs that amount rounded to two decimal places.
         The program ends with a newline.
*/

import java.util.Scanner;

public class LabProgram3 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        double x;
        double y;
        double z;

        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();

        System.out.print(Math.pow(x, z));
        System.out.print(" ");
        System.out.print(Math.pow(x, Math.pow(y, z)));
        System.out.print(" ");
        System.out.print(Math.abs(y));
        System.out.print(" ");
        System.out.print(Math.sqrt(Math.pow((x * y), z)));
        System.out.println();
    }
}
