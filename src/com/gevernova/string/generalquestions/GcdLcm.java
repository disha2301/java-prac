package com.gevernova.string.generalquestions;
import java.util.Scanner;
class GcdLcm{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int numOne = scanner.nextInt();
        System.out.println("Enter second number");
        int numTwo = scanner.nextInt();
        int gcd = gcdCalc(numOne,numTwo);
        int lcm = lcmCalc(numOne,numTwo,gcd);
        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }
    public static int gcdCalc(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcmCalc(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}