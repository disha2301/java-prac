package com.gevernova.exceptionhandeling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int numOne = scanner.nextInt();
            System.out.println("Enter first number");
            int numTwo = scanner.nextInt();
            // Perform division
            int result = numOne / numTwo;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        } finally{
            // Cleanup
            System.out.println("Program ended.");
        }
    }
}
