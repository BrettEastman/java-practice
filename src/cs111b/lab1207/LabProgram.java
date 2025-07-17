package cs111b.lab1207;

/*
 * Name: Brett Eastman
 * Class: CS111B - Programming Fundamentals in Java
 * Date: 07/17/2025
 * Instructor: David Harden
 * File Name: LabProgram.java
 * Purpose: This program takes in user input of the file name then converts that into a FileInputStream,
 *          then uses that to create the Scanner fileReader to read each line of the file. We create
 *          variables for each students first and last name and their scores. We also keep a running count
 *          of the number of students and all Midterm1, Midterm2, and Final scores so we can average them
 *          out later. We create a new file by first assigning resultStream to a FileOutputStream object
 *          using the filename "report.txt" as the argument, then using the PrintWriter class to allow us
 *          to print to that new file.
 *          We use a while loop for all the main logic, including incrementing the count, reading each line
 *          of the file, printing that line to report.txt, reading each name and grades from each line using
 *          the Scanner class, getting an average score and determining their letter grade, then printing that
 *          at the end of the line.
 *          After the while loop is done, we close the fileReader, then determine the averages of all the students
 *          grades, then print those averages using special output formatting with formatting specifiers. Then
 *          we close the resultFinal (the report.txt file).
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        String fileName = scnr.nextLine();
        FileInputStream fileInput = new FileInputStream(fileName);
        Scanner fileReader = new Scanner(fileInput);
        String lastName;
        String firstName;
        int midterm1;
        int midterm2;
        int finalScore;
        int count = 0;
        double averageMidterm1 = 0.0;
        double averageMidterm2 = 0.0;
        double averageFinal = 0.0;
        FileOutputStream resultStream = new FileOutputStream("report.txt");
        PrintWriter resultFinal = new PrintWriter(resultStream);

        while (fileReader.hasNextLine()) {
            count++;
            String currentLine = fileReader.nextLine();
            resultFinal.print(currentLine);

            Scanner lineRead = new Scanner(currentLine);
            int averageScore;
            char letterGrade;

            lastName = lineRead.next();
            firstName = lineRead.next();
            midterm1 = lineRead.nextInt();
            midterm2 = lineRead.nextInt();
            finalScore = lineRead.nextInt();

            averageScore = (midterm1 + midterm2 + finalScore) / 3;

            averageMidterm1 += (double) midterm1;
            averageMidterm2 += (double) midterm2;
            averageFinal += (double) finalScore;

            if (averageScore >= 90) {
                letterGrade = 'A';
            } else if (averageScore >= 80) {
                letterGrade = 'B';
            } else if (averageScore >= 70) {
                letterGrade = 'C';
            } else if (averageScore >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            resultFinal.println("\t" + letterGrade);
        }

        fileReader.close();

        averageMidterm1 = averageMidterm1 / count;
        averageMidterm2 = averageMidterm2 / count;
        averageFinal = averageFinal / count;

        resultFinal.println("");
        resultFinal.printf("Averages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", averageMidterm1, averageMidterm2,
                averageFinal);

        resultFinal.close();
    }
}