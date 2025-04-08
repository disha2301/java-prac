package com.gevernova.string.generalquestions;
import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        printFibonacci(n);
    }
    static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
