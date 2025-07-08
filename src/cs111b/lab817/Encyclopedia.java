package cs111b.lab817;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/07/2025
Instructor: David Harden
File Name: Encyclopedia.java
Description: Implement Encyclopedia, a subclass of book. It extends
             the book by adding the edition and the number of pages.
             We also override the original printInfo method from the
             parent class but calling "super.printInfo()" then adding
             the additional fields to be printed as well.
*/

public class Encyclopedia extends Book {
    private String edition;
    private int numPages;

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getEdition() {
        return this.edition;
    }

    public int getNumPages() {
        return this.numPages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + this.edition);
        System.out.println("   Number of Pages: " + this.numPages);
    }

}