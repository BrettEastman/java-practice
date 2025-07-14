package cs111b.lab1009;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/14/2025
Instructor: David Harden
File Name: StatePair.java
Purpose: Defined constructor, toString, compareTo, and comparisonSymbol methods for Pair class
         using the generic type TheType.
*/

public class Pair<TheType extends Comparable<TheType>> {
    private TheType firstVal;
    private TheType secondVal;

    public Pair(TheType aVal, TheType bVal) {
        firstVal = aVal;
        secondVal = bVal;
    }

    public String toString() {
        return "[" + firstVal + ", " + secondVal + "]";
    }

    // Implement Comparable's expected compareTo()
    public int compareTo(Pair<TheType> otherPair) {
        int comparisonVal = this.firstVal.compareTo(otherPair.firstVal);

        if (comparisonVal == 0) {
            comparisonVal = this.secondVal.compareTo(otherPair.secondVal);
        }

        return comparisonVal;
    }

    // Return '<', '=', or '>' according to the ordering of this pair and otherPair
    public char comparisonSymbol(Pair<TheType> otherPair) {
        if (this.compareTo(otherPair) < 0) {
            return '<';
        } else if (this.compareTo(otherPair) == 0) {
            return '=';
        } else {
            return '>';
        }
    }

}
