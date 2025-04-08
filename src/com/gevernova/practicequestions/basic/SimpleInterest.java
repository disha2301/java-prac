package com.gevernova.practicequestions.basic;
import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Principal amount, Rate of Interest, and Time
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in % per year): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated Simple Interest
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
