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
        int a = 0, b = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
