package cs111b;

// Write a program that reads an integer, a list of words, and a character. The integer signifies how many words are in the list. The output of the program is every word in the list that contains the character at least once. For coding simplicity, follow each output word by a comma, even the last one. Add a newline to the end of the last output. Assume at least one word in the list will contain the given character. Assume that the list of words will always contain fewer than 20 words
// Ex: If the input is:
// 4 hello zoo sleep drizzle z
// then the output is:
// zoo,drizzle,
// To achieve the above, first read the list into an array. Keep in mind that the character 'a' is not equal to the character 'A'.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/24/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes a string array wordList, declares two chars commonChar and
         currentChar, two strings currentWord and finalString, and three ints numWords,
         i, and j. We get the number of words from the first integer input, then we input
         the following words into wordList, using a for loop. The last thing in the input
         is a char which we assign to commonChar. Then we use a nested for loop to go
         through the words, then with each word, we use the nested loop to iterate over
         each char, comparing it to commonChar. If it is a match, we add that word to the
         finalString with a comma, then break out of the word iteration nested loop to go
         on to the next word. Once that is complete, we have our final string and we
         output it, followed by a new line.
*/

import java.util.Scanner;

public class LabProgram22 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] wordList = new String[19];
        char commonChar;
        char currentChar;
        String currentWord;
        String finalString = "";
        int numWords;
        int i;
        int j;
        boolean foundChar = false;

        numWords = scnr.nextInt();

        for (i = 0; i < numWords; ++i) {
            wordList[i] = scnr.next();
        }

        commonChar = scnr.next().charAt(0);

        for (i = 0; i < numWords; ++i) {
            currentWord = wordList[i];
            foundChar = false;
            for (j = 0; j < currentWord.length(); ++j) {
                currentChar = currentWord.charAt(j);
                if (currentChar == commonChar && foundChar == false) {
                    finalString += currentWord;
                    finalString += ",";
                    foundChar = true;
                }
            }
        }

        System.out.println(finalString);
    }
}
