package general;

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

public class LabProgram2 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int age;
        int weight;
        int heartRate;
        int time;
        double caloriesBurned;

        age = scnr.nextInt();
        weight = scnr.nextInt();
        heartRate = scnr.nextInt();
        time = scnr.nextInt();

        caloriesBurned = ((age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * time) / 8.368;

        System.out.print("Calories: ");
        System.out.printf("%.2f", caloriesBurned);
        System.out.println(" calories");
    }
}
