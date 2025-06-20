package cs111b;

import java.util.Scanner;

public class LabProgram6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int int1;
        int int2;
        int int3;
        int smallest;

        int1 = scnr.nextInt();
        int2 = scnr.nextInt();
        int3 = scnr.nextInt();
        smallest = int1;

        if (int2 < smallest) {
            smallest = int2;
        }
        if (int3 < smallest) {
            smallest = int3;
        }

        System.out.println(smallest);

    }
}
