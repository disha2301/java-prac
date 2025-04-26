package com.gevernova.string.extrasstringhandling;
import java.util.*;
class ToggleCase {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // Convert to lowercase
            }
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // Convert to uppercase
            }
            else {
                result += ch;
            }
        }

        System.out.println("Toggled string: " + result);
    }
}
