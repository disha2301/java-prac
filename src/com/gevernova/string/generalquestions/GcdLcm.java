package com.gevernova.string.generalquestions;
import java.util.Scanner;
class GcdLcm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int gcd = gcdCalc(num1,num2);
        int lcm = lcmCalc(num1,num2,gcd);
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