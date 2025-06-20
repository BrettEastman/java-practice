package cs111b;

/*
 Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/15/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program reads integers userNum and divNum as input,
         and outputs userNum divided by divNum three times.
         The program ends with a newline.
*/

import java.util.Scanner;

public class LabProgram {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        userNum = userNum / divNum;
        System.out.println(userNum);
        userNum = userNum / divNum;
        System.out.println(userNum);
        userNum = userNum / divNum;
        System.out.println(userNum);
    }
}
