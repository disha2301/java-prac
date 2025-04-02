// Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P => 
// Is the first number the largest? ____
// Is the second number the largest? ___
// Is the third number the largest? ___

import java.util.Scanner;
class LargestOfThree_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Is the first number the largest? " + (a > b && a > c ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (b > a && b > c ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (c > a && c > b ? "Yes" : "No"));
    }
}
    
