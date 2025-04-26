package com.gevernova.controlflow.levelthree;
import java.util.*;

class LeapYearOrNot { 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year after 1582: ");
        int yr = scanner.nextInt();

        if (yr < 1582) {
            System.out.println("Invalid input! Year must be 1582 or later.");
        } else {
            if ((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0)) {
                System.out.println(yr + " is a Leap Year.");
            } else {
                System.out.println(yr + " is NOT a Leap Year.");
            }
        }
    }
}
