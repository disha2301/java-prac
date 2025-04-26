package com.gevernova.string.leveltwo;
import java.util.Scanner;
public class SimpleCharType {

    // Method to check type of character
    public static String getType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert uppercase to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = getType(ch);
            System.out.println("   " + ch + "\t\t" + type);
        }
    }
}
