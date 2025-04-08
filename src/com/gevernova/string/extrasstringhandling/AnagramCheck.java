package com.gevernova.string.extrasstringhandling;
import java.util.*;
class AnagramCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter first string : ");
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
            return;
        }
        int[] freq1 = new int[256];  
        int[] freq2 = new int[256]; 
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}