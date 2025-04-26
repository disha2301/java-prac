package com.gevernova.string.extrasstringhandling;
import java.util.*;
class LongestWordPresent {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scanner.nextLine() + " "; // extra space to process last word

        String word = "", longest = "";
        
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character != ' ') {
                word += character;
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = ""; // reset for next word
            }
        }

        System.out.println("Longest word is: " + longest);
    }
}
