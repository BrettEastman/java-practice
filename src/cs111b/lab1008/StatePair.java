package cs111b.lab1008;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/14/2025
Instructor: David Harden
File Name: StatePair.java
Purpose: Defined constructor, setters, getters, and printInfo method for StatePair class
         using the generic types Type1 and Type2.
*/

public class StatePair<Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
    private Type1 value1;
    private Type2 value2;

    public StatePair(Type1 value1, Type2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(Type1 val1) {
        this.value1 = val1;
    }

    public void setValue2(Type2 val2) {
        this.value2 = val2;
    }

    public Type1 getValue1() {
        return this.value1;
    }

    public Type2 getValue2() {
        return this.value2;
    }

    public void printInfo() {
        System.out.println(value1 + ": " + value2);
    }
}