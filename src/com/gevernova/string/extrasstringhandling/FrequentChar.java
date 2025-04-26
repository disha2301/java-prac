package com.gevernova.string.extrasstringhandling;
import java.util.Scanner;
class FrequentChar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch] > maxCount){
                maxChar = ch;
                maxCount = freq[ch];
            }
        }
        System.out.println("Most frequent character is "+maxChar+" that has occured "+ maxCount+" times");
    }
}
