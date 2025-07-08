package cs111b.lab819;

/*
Name: Brett Eastman
Class: CS111B - Programming Fundamentals in Java
Date: 07/07/2025
Instructor: David Harden
File Name: Course.java
Description: Implement main method to test Plant and Flower classes, as well as printArrayList.
             At the end of main, print all info using the printArrayList method.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {

    // Create method to add header with plant number, followed by a call to the
    // printInfo method of the current plant
    public static void printArrayList(ArrayList<Plant> list) {
        for (int i = 0; i < list.size(); i++) {
            Plant currentPlant = list.get(i);
            System.out.println("Plant " + (i + 1) + " Information: ");
            currentPlant.printInfo();
            System.out.println("");
        }
    }

    // Declare and instantiate myGarden to be an ArrayList of Plant classes. Declare
    // all of the requested variables and their types. While the user input is not
    // -1, first determine whether the plant is a plant or flower, then gather the
    // data (i.e. plantName or flowerName, etc), instantiate a new Plant and set the
    // values accordingly, then add it to the ArrayList, myGarden.
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        ArrayList<Plant> myGarden = new ArrayList<Plant>();

        String plantName;
        String flowerName;
        String colorOfFlowers;
        int plantCost;
        int flowerCost;
        boolean isAnnual;

        input = scnr.next();
        while (!input.equals("-1")) {
            if (input.equals("plant")) {
                plantName = scnr.next();
                plantCost = scnr.nextInt();

                Plant newPlant = new Plant();

                newPlant.setPlantName(plantName);
                newPlant.setPlantCost(String.valueOf(plantCost));
                myGarden.add(newPlant);
            } else if (input.equals("flower")) {
                flowerName = scnr.next();
                flowerCost = scnr.nextInt();
                isAnnual = scnr.nextBoolean();
                colorOfFlowers = scnr.next();

                Flower newFlower = new Flower();

                newFlower.setPlantName(flowerName);
                newFlower.setPlantCost(String.valueOf(flowerCost));
                newFlower.setColorOfFlowers(colorOfFlowers);
                newFlower.setPlantType(isAnnual);
                myGarden.add(newFlower);
            }

            input = scnr.next();
        }

        printArrayList(myGarden);
    }
}
