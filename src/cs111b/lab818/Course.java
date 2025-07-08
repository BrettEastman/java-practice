package cs111b.lab818;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/07/2025
Instructor: David Harden
File Name: Course.java
Description: Implement Course, the base class for the assignment. Give it
             the responsability of creating the private strings for course
             number and course title, as well as the getters and setters for
             those fields. Create printInfo to print out the data as
             described in the prompt.
*/

public class Course {
    private String courseNumber;
    private String courseTitle;

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + this.courseNumber);
        System.out.println("   Course Title: " + this.courseTitle);
    }
}
