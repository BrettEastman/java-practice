package cs111b.lab1208;

/*
 * Name: Brett Eastman
 * Class: CS111B - Programming Fundamentals in Java
 * Date: 07/17/2025
 * Instructor: David Harden
 * File Name: LabProgram.java
 * Purpose: This program uses Scanner to get the input from the user to determine which file to open,
 *          then it creates a FileInputStream and fileReader Scanner to read each line of the file. We
 *          create the string prevMovie which will keep track of whether we have already seen the movie
 *          in our file, then a boolean isFirst that we will use to know when not to add a new line.
 *          A while loop iterates through each line of the file while there is a next line. We create
 *          a string array splitStringArr to split each string and separate the values by comma. We also
 *          declare and create a new string variable, currentMovie, so we can compare it to the previous
 *          movie. If the movie is not the same as the previous movie, we print out a new listing with
 *          output formatting to make the name of the movie a left-justified minimum and a maximum of 44
 *          characters, either filling the empty space with spaces or cutting off any characters beyond
 *          44 if the title is long. Then the rating is right-justified to 5 characters. For the times,
 *          if we have seen the movie in the previous line, we just add on the next time with a space
 *          in front. In the end, we print one more new line.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        String fileName = scnr.nextLine();
        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner fileReader = new Scanner(fileStream);
        String prevMovie = "";
        boolean isFirst = true;

        while (fileReader.hasNextLine()) {
            String[] splitStringArr = fileReader.nextLine().split(",");
            String currentMovie = splitStringArr[1];

            if (currentMovie.equals(prevMovie)) {
                System.out.print(" " + splitStringArr[0]);
            } else {
                if (!isFirst) {
                    System.out.println();
                }
                System.out.printf("%-44.44s | %5s | %s", currentMovie, splitStringArr[2], splitStringArr[0]);
            }

            prevMovie = currentMovie;
            isFirst = false;
        }

        System.out.println("");
    }
}
