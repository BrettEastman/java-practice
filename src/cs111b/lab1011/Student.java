package cs111b.lab1011;

/*
 * Name: Brett Eastman
 * Class: CS111B - Programming Fundamentals in Java
 * Date: 07/14/2025
 * Instructor: David Harden
 * File Name: Student.java
 * Purpose: Implements Student class with String firstName, String lastName, and double GPA, with the following methods:
 *          compareTo(otherStudent) - to enable sorting of Student objects with precedence of comparisons: GPA (highest first),
 *          lastName (lowest first), then firstName (lowest first)
 *          toString() - return a string representation of a student in the format "GPA lastName, firstName"
 */

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Double GPA;

    public Student(String first, String last, Double gradeAverage) {
        firstName = first;
        lastName = last;
        GPA = gradeAverage;
    }

    public int compareTo(Student otherStudent) {
        // for GPA, need to start with otherStudent so that it will be in reverse order
        int comparisonVal = otherStudent.GPA.compareTo(this.GPA);

        if (comparisonVal == 0) {
            comparisonVal = this.lastName.compareTo(otherStudent.lastName);
        }

        if (comparisonVal == 0) {
            comparisonVal = this.firstName.compareTo(otherStudent.firstName);
        }

        return comparisonVal;
    }

    public String toString() {
        return String.format("%.2f", GPA) + " " + lastName + ", " + firstName;
    }
}