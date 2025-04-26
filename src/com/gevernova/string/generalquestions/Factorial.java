package com.gevernova.string.generalquestions;
import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
    public static long factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return n*factorial(n-1);
    }
}