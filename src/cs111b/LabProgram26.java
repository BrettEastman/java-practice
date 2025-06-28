package cs111b;

// Define a method named getWordFrequency that takes an array of strings, the size of the array, and a search word as parameters. Method getWordFrequency() then returns the number of occurrences of the search word in the array parameter (case insensitive).

// Then, write a main program that reads a list of words into an array, calls method getWordFrequency() repeatedly, and outputs the words in the arrays with their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain less than 20 words.

// Ex: If the input is:

// 5 hey Hi Mark hi mark
// the output is:

// hey 1
// Hi 2
// Mark 2
// hi 2
// mark 2
// Hint: Use the equalsIgnoreCase() method for comparing strings, ignoring case.

// The program must define and call a method:
// public static int getWordFrequency(String[] wordsList, int listSize, String currWord)

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 06/27/2025
Instructor: David Harden
File Name: LabProgram.java
Description: Program has a getWordFrequency method, which gets the frequency of
             each word in a string array, and returns that integer frequency. The
             main program creates an integer numWords, which is the first integer
             input from the user. Then it creates a string array wordsArr, initialized
             to the size of numWords, then it also creates a string called word.
             The first for loop populates the array with words input by the user.
             The second for loop iterates through that array, gets the frequency
             of each word using the getWordFrequency method, and outputs the word
             and its frequency.
*/

import java.util.Scanner;

public class LabProgram26 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords = scnr.nextInt();
        String[] wordsArr = new String[numWords];
        String word;

        for (int i = 0; i < numWords; ++i) {
            wordsArr[i] = scnr.next();
        }

        for (int i = 0; i < numWords; ++i) {
            word = wordsArr[i];
            int freq = getWordFrequency(wordsArr, i, word);
            System.out.println(word + " " + freq);
        }
    }

    // The getWordFrequency method takes a string array, wordsList, and integer
    // listSize, and a string currWord. The method initializes the integer
    // numOccurrences to zero and creates a variable string currentWord. Then uses a
    // for loop to iterate over the wordsList and compare the current word in the
    // list with the argument, currWord, to see if they are a match, and if so, we
    // increment numOccurrences. at the end of that loop we return numOccurrences.
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
        int numOccurrences = 0;
        String currentWord;

        for (int i = 0; i < listSize; ++i) {
            currentWord = wordsList[i];
            if (currentWord.equalsIgnoreCase(currWord)) {
                numOccurrences++;
            }
        }

        return numOccurrences;
    }
}
