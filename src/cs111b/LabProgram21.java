package cs111b;

// Write a program that reads a list of words. Then, the program outputs those words and their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain fewer than 20 words.
// Ex: If the input is:
// 5 hey hi Mark hi mark
// the output is:
// hey - 1
// hi - 2
// Mark - 1
// hi - 2
// mark - 1
// Hint: Use two arrays, one array for the strings and one array for the frequencies.

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/24/2025
Instructor: David Harden
File Name: LabProgram.java
Purpose: Program initializes a string array wordList, an integer array freqList,
         strings currentWord and compareWord, and integers numWords, i, and j.
         We assign the first input to numWords, which lets us know how many words
         there will be and the size of the arrays. We perform the first for loop
         to initialize all of the array elements in wordList to inputs from the user
         as well as fill all the freqList elements with 1. Then we perform a nested
         for loop, both iterating over the wordList array and assigning currentWord
         with the main current word, while then iterating over the rest of the array
         to compare those words to the current word. If we see the same word, then
         we increment both indices in freqList to count the number of times a given
         word occurs. Finally, we perform one last for loop to print out each word
         and the number of times it occurs.
*/

import java.util.Scanner;

public class LabProgram21 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] wordList = new String[19];
        int[] freqList = new int[19];
        int numWords;
        String currentWord;
        String compareWord;
        int i;
        int j;

        numWords = scnr.nextInt();

        for (i = 0; i < numWords; ++i) {
            wordList[i] = scnr.next();
            freqList[i] = 1;
        }

        for (i = 0; i < numWords; ++i) {
            currentWord = wordList[i];
            for (j = i + 1; j < numWords; ++j) {
                compareWord = wordList[j];
                if (currentWord.equals(compareWord)) {
                    freqList[i]++;
                    freqList[j]++;
                }
            }
        }

        for (i = 0; i < numWords; ++i) {
            currentWord = wordList[i];
            System.out.println(currentWord + " - " + freqList[i]);
        }
    }
}
