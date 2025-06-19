package general;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/18/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes strings first, last, char lastInitial,
         and integers year and yearSingle. Then it assigns those to
         the inputs, then we determin if the first name is greager
         than 6 charachers. If so, we reduces it to six, otherwise
         we leave it as is. Then we get the lastInital using the charAt
         method and the last num of the year using the modulo. We
         then print out the login according to the instructions.
*/

import java.util.Scanner;

public class LabProgram11 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String first;
        String last;
        char lastInitial;
        int year;
        int yearSingle;

        first = scnr.next();
        last = scnr.next();
        year = scnr.nextInt();

        first = first.length() > 6 ? first.substring(0, 6) : first;
        lastInitial = last.charAt(0);
        yearSingle = year % 10;

        System.out.println("Your login name: " + first + lastInitial + "_" + yearSingle);
    }
}
