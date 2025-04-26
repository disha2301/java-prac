package com.gevernova.method.levelone;
import java.util.Scanner;

public class ChocolateDivider {
    //method to calculate the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) { 
        int[] result = new int[2]; 
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among 0 children!");
            return;
        }
        //calling the function
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
