package general;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/18/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes strings firstName, secondNamesLine, middleName, and lastName,
         as well as int spaceIndex. It gets an input and assigns the first word to firstName,
         then the rest into secondNamesLine. It then searches for the space after the first one
         and assigns spaceIndex to that value. It then checks to see if there actuall was a space.
         If not, it assigns the lastName to thatsecondNamesLine minus the first space, otherwise it
         assigns middlName to the first sustring before the space and the lastName to the second
         substring after the space. Then we convert firstName to just the first chacher with a period.
         Lastly we check if there is a middleName. If so we also convert that to the first initial and
         a period, then print out the lastName, a comma and the first two initials. Otherwise we just
         print out the lastName and the first initial.
*/

import java.util.Scanner;

public class LabProgram10 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String secondNamesLine;
        String middleName = "";
        String lastName;
        int spaceIndex;

        firstName = scnr.next();
        secondNamesLine = scnr.nextLine();

        spaceIndex = secondNamesLine.indexOf(' ', 1);

        if (spaceIndex == -1) {
            lastName = secondNamesLine.substring(1);
        } else {
            middleName = secondNamesLine.substring(1, spaceIndex);
            lastName = secondNamesLine.substring(spaceIndex + 1);
        }

        firstName = firstName.charAt(0) + ".";

        if (!middleName.equals("")) {
            middleName = middleName.charAt(0) + ".";
            System.out.println(lastName + ", " + firstName + middleName);
        } else {
            System.out.println(lastName + ", " + firstName);
        }
    }
}