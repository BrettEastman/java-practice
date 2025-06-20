package cs111b;

import java.util.Scanner;

public class LabProgram7 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highway;

        highway = scnr.nextInt();

        if (highway > 0 && highway < 100) {
            if (highway % 2 == 1) {
                System.out.println("I-" + highway + " is primary, going north/south.");
            } else {
                System.out.println("I-" + highway + " is primary, going east/west.");
            }
        } else if ((highway <= 999) && (highway % 100 != 0)) {
            if (highway % 2 == 1) {
                System.out.println(
                        "I-" + highway + " is auxiliary, serving I-" + (highway % 100) + ", going north/south.");
            } else {
                System.out
                        .println("I-" + highway + " is auxiliary, serving I-" + (highway % 100) + ", going east/west.");
            }
        } else {
            System.out.println(highway + " is not a valid interstate highway number.");
        }
    }
}
