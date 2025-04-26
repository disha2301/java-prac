
package com.gevernova.string.extrasstringhandling;
import java.util.*;
class RemoveDuplicate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = scanner.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("New String without duplicates: " + result);
    }
}
