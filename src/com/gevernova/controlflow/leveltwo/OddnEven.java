package com.gevernova.controlflow.leveltwo;
import java.util.*;

class OddnEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        // Loop from 1 to n to check each number
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is a " + (i % 2 == 0 ? "Even number" : "Odd number"));
        }
    }
}
