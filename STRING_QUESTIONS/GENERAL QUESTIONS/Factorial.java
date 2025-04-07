/*6. Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes. */
import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
    public static long factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return n*factorial(n-1);
    }
}