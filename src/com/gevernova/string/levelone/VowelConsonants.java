package com.gevernova.string.levelone;
import java.util.*;
class VowelConsonants{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String string = scanner.nextLine();
        int count[] = myCount(string);
        System.out.println("The given string has "+count[0]+" vowels");
        System.out.println("The given string has "+count[1]+" consonants");
    }
    public static String checkCase(char ch){
        //to convert from uppercase to lower case
        if(ch>='A' && ch<='Z'){
            ch = (char)(ch+32);
        }
        //check for vowels
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o'|| ch == 'u'){
            return "Vowel";
        }
        //check for consonants
        else if(ch>= 'a' && ch<='z'){
            return "Consonant";
        }
        return "Not a letter";
    }
    public static int[] myCount(String str){
        int vowel=0;
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            String type = checkCase(ch);
            if(type.equals("Vowel")) vowel++;
            else if(type.equals("Consonant")) count++;
        }
        return new int[]{vowel,count};
    }
}