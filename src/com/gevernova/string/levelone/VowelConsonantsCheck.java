package com.gevernova.string.levelone;
import java.util.*;
class VowelConsonantsCheck {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String string = scanner.nextLine();
        String ans[][]=myCheck(string);
        display(ans);
    }
    //function to check if the character is Vowel, Consonant or letter
    public static String myCheckType(char ch){
        if(ch >='A' && ch<='Z')
        ch = (char)(ch+32);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return "Vowel";
        else if(ch>='a' && ch<='z')
        return "Consonant";
        return "Not a letter";
    }
    //function to store in 2D array
    public static String[][] myCheck(String str){
        int len = str.length();
        String[][] charType = new String[len][2];
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            charType[i][0]=String.valueOf(ch);
            charType[i][1]=myCheckType(ch);
        }
        return charType;
    }
    public static void display(String[][] result){
        System.out.println("\n Character \n Type");
        for(String[] row:result){
            System.out.println(row[0]+" is a "+ row[1]);
        }
    }
}
