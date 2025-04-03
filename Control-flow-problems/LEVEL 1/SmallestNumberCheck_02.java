// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____
import java.util.Scanner;

public class SmallestNumberCheck_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}

