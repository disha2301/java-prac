package com.gevernova.controlflow.levelone;
import java.util.Scanner;
class VoteCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter their age
        System.out.println("Enter age:");
        int age = sc.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
