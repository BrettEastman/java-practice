package cs111b.lab1011;

/*
 * Name: Brett Eastman
 * Class: CS111B - Programming Fundamentals in Java
 * Date: 07/14/2025
 * Instructor: David Harden
 * File Name: Course.java
 * Purpose: Implements Course class with String department and Integer number, with the following methods:
 *          compareTo(otherCourse) - to enable sorting of Course objects with precedence of department (lowest first), then number (lowest first)
 *          toString() - return a string representation of a course in the format "department number"
 */

public class Course implements Comparable<Course> {
    private String department;
    private Integer number;

    public Course(String dept, Integer num) {
        department = dept;
        number = num;
    }

    public int compareTo(Course otherCourse) {
        int comparisonVal = this.department.compareTo(otherCourse.department);

        if (comparisonVal == 0) {
            comparisonVal = this.number.compareTo(otherCourse.number);
        }

        return comparisonVal;
    }

    public String toString() {
        return department + " " + number;
    }
}