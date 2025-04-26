package com.gevernova.string.extrasstringhandling;
import java.util.*;
class AnagramCheck{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String strOne = scanner.nextLine();
        System.out.print("Enter first string : ");
        String strTwo = scanner.nextLine();
        if(strOne.length() != strTwo.length()){
            System.out.println("Not Anagrams");
            return;
        }
        int[] freqOne = new int[256];
        int[] freqTwo = new int[256];
        for (int i = 0; i < strOne.length(); i++) {
            freqOne[strOne.charAt(i)]++;
            freqTwo[strTwo.charAt(i)]++;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (freqOne[i] != freqTwo[i]) {
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