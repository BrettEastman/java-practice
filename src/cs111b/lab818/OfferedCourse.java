package cs111b.lab818;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/07/2025
Instructor: David Harden
File Name: Course.java
Description: Implement OfferedCourse, the base class for the assignment.
             It extends the class Course by creating three more fields,
             instructorName, classLocation, and classTime, along with their
             getters and setters.
*/

public class OfferedCourse extends Course {
    private String instructorName;
    private String classLocation;
    private String classTime;

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public String getLocation() {
        return this.classLocation;
    }

    public String getClassTime() {
        return this.classTime;
    }
}