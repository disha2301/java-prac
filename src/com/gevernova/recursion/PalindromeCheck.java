package com.gevernova.recursion;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Mismatch found
        }
        return isPalindrome(str, start + 1, end - 1); // Recursive check on substring
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}