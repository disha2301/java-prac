package com.gevernova.string.generalquestions;
import java.util.*;
class MaxofThree{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of number 1 : ");
        int numOne = scanner.nextInt();
        System.out.println("Enter value of number 2 : ");
        int numTwo = scanner.nextInt();
        System.out.println("Enter value of number 3 : ");
        int numThree = scanner.nextInt();
        int maxNum = numOne;
        if(numTwo > maxNum) maxNum = numTwo;
        if(numThree > maxNum) maxNum = numThree;
        System.out.println("Maximum value is : "+maxNum);

    }
}