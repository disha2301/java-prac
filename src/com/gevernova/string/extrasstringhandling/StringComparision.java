package com.gevernova.string.extrasstringhandling;
import java.util.*;

class StringComparision {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = (len1 < len2) ? len1 : len2;
        boolean areEqual = true;
        int result = 0;

        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                result = ch1 - ch2;
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            if (len1 == len2) {
                System.out.println("Strings are equal.");
            } else {
                result = len1 - len2;
                System.out.println((result < 0) ? "First string comes first." : "Second string comes first.");
            }
        } else {
            System.out.println((result < 0) ? "First string comes first." : "Second string comes first.");
        }
    }
}
