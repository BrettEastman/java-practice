package cs111b.lab729;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numToBuy;
        int numToRestock;
        VendingMachine vendingMachine = new VendingMachine();

        numToBuy = scnr.nextInt();
        numToRestock = scnr.nextInt();

        vendingMachine.purchase(numToBuy);
        vendingMachine.restock(numToRestock);

        vendingMachine.report();
    }
}
