package com.gevernova.string.extrasstringhandling;
import java.util.*;
class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = scanner.nextLine();
        int vowel = 0, cons = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    cons++;
                }
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + cons);
    }
}
