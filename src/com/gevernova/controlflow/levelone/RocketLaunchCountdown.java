package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class RocketLaunchCountdown {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown starting value: ");
        int n = scanner.nextInt();

        // Countdown using while-loop
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        System.out.println("Launching now!");
    }
}
