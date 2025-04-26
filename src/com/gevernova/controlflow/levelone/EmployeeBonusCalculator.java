package com.gevernova.controlflow.levelone;

import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter number of years served: ");
        int years = scanner.nextInt();

        // Calculate and display bonus if applicable
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("You got a bonus of " + bonus);
            System.out.println("Total salary is " + (salary + bonus));
        } else {
            System.out.println("Sorry, no bonus!");
            System.out.println("Total salary is " + salary);
        }
    }
}
