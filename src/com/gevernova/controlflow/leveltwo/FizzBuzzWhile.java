package com.gevernova.controlflow.leveltwo;
import java.util.*;

public class FizzBuzzWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        // Ensure the input is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;

            // Loop from 1 to n and apply FizzBuzz logic
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);

                i++;
            }
        }
    }
}
