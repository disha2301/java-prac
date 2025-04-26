package com.gevernova.string.extrasstringhandling;
import java.util.*;

class StringComparision {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String strOne = scanner.nextLine();

        System.out.println("Enter second string:");
        String strTwo = scanner.nextLine();

        int lenOne = strOne.length();
        int lenTwo = strTwo.length();
        int minLen = (lenOne < lenTwo) ? lenOne : lenTwo;
        boolean areEqual = true;
        int result = 0;

        for (int i = 0; i < minLen; i++) {
            char ch1 = strOne.charAt(i);
            char ch2 = strTwo.charAt(i);

            if (ch1 != ch2) {
                result = ch1 - ch2;
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            if (lenOne == lenTwo) {
                System.out.println("Strings are equal.");
            } else {
                result = lenOne - lenTwo;
                System.out.println((result < 0) ? "First string comes first." : "Second string comes first.");
            }
        } else {
            System.out.println((result < 0) ? "First string comes first." : "Second string comes first.");
        }
    }
}
