package com.gevernova.string.levelone;
import java.util.*;
class Length{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String string = scanner.next();
        int len1 = lengthCalc(string);
        int len2 = string.length();
        System.out.print("Lenght calculated without inbuilt method : "+len1+"\n");
        System.out.print("Length calculated with inbuilt method : "+len2);
    }
    static int lengthCalc(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }
        catch(IndexOutOfBoundsException e){
            return count;
        }
    }
}