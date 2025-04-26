package com.gevernova.string.levelthree;
import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPalindrome1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }
    static boolean isPalindrome3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check for Palindrome: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.println("Using Logic 1 (start-end comparison): " + isPalindrome1(input));
        System.out.println("Using Logic 2 (recursion): " + isPalindrome2(input, 0, input.length() - 1));
        System.out.println("Using Logic 3 (char arrays): " + isPalindrome3(input));
    }
}
