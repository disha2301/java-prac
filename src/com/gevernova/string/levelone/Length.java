package com.gevernova.string.levelone;
import java.util.*;
class Length{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scanner.next();
        int len1 = lengthCalc(s);
        int len2 = s.length();
        System.out.print("Lenght calculated without inbuilt method : "+len1+"\n");
        System.out.print("Length calculated with inbuilt method : "+len2);
    }
    static int lengthCalc(String s){
        int c=0;
        try{
            while(true){
                s.charAt(c);
                c++;
            }
        }
        catch(IndexOutOfBoundsException e){
            return c;
        }
    }
}