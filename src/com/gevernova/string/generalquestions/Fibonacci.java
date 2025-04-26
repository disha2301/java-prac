package com.gevernova.string.generalquestions;
import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = scanner.nextInt();
        printFibonacci(num);
    }
    static void printFibonacci(int num) {
        int numOne = 0, numTwo = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= num; i++) {
            System.out.print(numOne + " ");
            int next = numOne + numTwo;
            numOne = numTwo;
            numTwo = next;
        }
    }
}
