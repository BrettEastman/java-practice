package cs111b.lab1206;

/*
 * Name: Brett Eastman
 * Class: CS111B - Programming Fundamentals in Java
 * Date: 07/17/2025
 * Instructor: David Harden
 * File Name: Course.java
 * Purpose: This program declares the String fileName and initializes it with the nextLine of user input.
 *          It declares the FileInputStream photoFileStream and initializes it with fileName. It also
 *          declares a Scanner object called photoFileInputScanner that is initialized with the
 *          photoFileStream FileInputStream object. It then reads the lines of the input file one at a
 *          time with a while loop. For each line, we create a new String using a substring of the
 *          original string, cutting off the last 10 characters, with "_info.txt" concatenated to the
 *          end, then we print that new string. When done, we close the file.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        String fileName = scnr.nextLine();
        FileInputStream photoFileStream = new FileInputStream(fileName);
        Scanner photoFileInputScanner = new Scanner(photoFileStream);

        while (photoFileInputScanner.hasNextLine()) {
            String currentLine = photoFileInputScanner.nextLine();
            int newLength = currentLine.length() - 10;
            currentLine = currentLine.substring(0, newLength) + "_info.txt";
            System.out.println(currentLine);
        }

        photoFileInputScanner.close();
    }
}
