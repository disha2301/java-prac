package com.gevernova.controlflow.levelone;

import java.util.Scanner;

class CountdownWithForLoop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown starting value: ");
        int n = scanner.nextInt();

        // Countdown using for-loop
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launching now!");
    }
}
