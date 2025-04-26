package com.gevernova.string.generalquestions;
import java.util.*;
class MaxofThree{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of number 1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter value of number 2 : ");
        int b = scanner.nextInt();
        System.out.println("Enter value of number 3 : ");
        int c = scanner.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("Maximum value is : "+max);

    }
}