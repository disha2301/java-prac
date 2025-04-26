package com.gevernova.string.generalquestions;
import java.util.*;
class NumberGuessing{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        String res = "";
        System.out.print("Think of any number between 1 and 100");
        while(!res.equals("correct") && low <= high){
            int guess = (low + high)/2;
            System.out.println("Is it "+guess+" ?");
            System.out.println("Enter 'high', 'low' or correct : ");
            res = scanner.nextLine().toLowerCase();
            if(res.equals("high")){
                high = guess-1;
            }else if(res.equals("low")){
                low=guess+1;
            }else if(!res.equals("correct")){
                System.out.println("Please enter a valid response");
            }
        }
        if(res.equals("correct"))
        System.out.println("I guessed it!!!");
        else
        System.out.println("Something went wrong");

    }
}