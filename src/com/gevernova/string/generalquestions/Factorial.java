package com.gevernova.string.generalquestions;
import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }
    public static long factorial(int num){
        if(num == 0 || num == 1) return 1;
        else return num*factorial(num-1);
    }
}