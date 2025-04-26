package com.gevernova.string.extrasstringhandling;
import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = scanner.nextLine();

        boolean pal = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                pal = false;
                break;
            }
        }

        System.out.println(pal ? "Palindrome" : "Not Palindrome");
    }
}
