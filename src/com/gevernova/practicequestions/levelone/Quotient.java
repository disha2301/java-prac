package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int q = num1 / num2;  // quotient
        int r = num1 % num2;  // remainder
        
        // Display the quotient and remainder
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n", q, r, num1, num2);        
    }
}
