package cs111b.lab911;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/11/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: For the main method, we have added a try/catch block around the if/else statement to
         determine whether it is a student ID or student name. If an exception is thrown from
         either the fine name or the findID method, we will print out the exception message.

         For the find ID method, we use a while loop to check and see if the file scanner argument
         has a next item to read. If so, then we create a string sName to get the first
         token and we create a string sID to get the second token, which is the student ID. We
         then check to see if the student name equals sName. And if so, we return the sID. If
         the while loop concludes and we have not returned an sID then a new exception is thrown,
         informing the user that the student ID was not found for the studentName argument. The
         findName method is in identical structure to the findID method, but here we are checking
         to see if the student ID equals sID and we would return the name sName. Otherwise, we
         would throw an exception informing the user that the student name was not found.
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {

    public static String findID(String studentName, Scanner infoScnr) throws Exception {
        while (infoScnr.hasNext()) {
            String sName = infoScnr.next();
            String sID = infoScnr.next();

            if (studentName.equals(sName)) {
                return sID;
            }
        }

        throw new Exception("Student ID not found for " + studentName);
    }

    public static String findName(String studentID, Scanner infoScnr) throws Exception {
        while (infoScnr.hasNext()) {
            String sName = infoScnr.next();
            String sID = infoScnr.next();

            if (studentID.equals(sID)) {
                return sName;
            }
        }

        throw new Exception("Student name not found for " + studentID);
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String studentName;
        String studentID;
        String studentInfoFileName;
        FileInputStream studentInfoStream = null;
        Scanner studentInfoScanner = null;

        // Read the text file name from user
        studentInfoFileName = scnr.next();

        // Open the text file
        studentInfoStream = new FileInputStream(studentInfoFileName);
        studentInfoScanner = new Scanner(studentInfoStream);

        // Read search option from user. 0: findID(), 1: findName()
        int userChoice = scnr.nextInt();

        try {
            if (userChoice == 0) {
                studentName = scnr.next();
                studentID = findID(studentName, studentInfoScanner);
                System.out.println(studentID);
            } else {
                studentID = scnr.next();
                studentName = findName(studentID, studentInfoScanner);
                System.out.println(studentName);
            }
        } catch (Exception excpt) {
            System.out.println(excpt.getMessage());
        }

        studentInfoStream.close();
    }
}
