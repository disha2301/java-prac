package com.gevernova.string.leveltwo;
import java.util.Scanner;

public class StringSplit {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int length = findLength(str);
        String word = "";
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount + 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }

        words[index] = word;
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] builtIn = input.split(" ");
        String[] custom = customSplit(input);

        System.out.println("Built-in split:");
        for (String word : builtIn) System.out.println(word);

        System.out.println("Custom split:");
        for (String word : custom) System.out.println(word);

        boolean same = compareArrays(builtIn, custom);
        System.out.println("Do they match? " + same);
    }
}
