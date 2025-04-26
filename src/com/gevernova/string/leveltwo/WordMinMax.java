package com.gevernova.string.leveltwo;
import java.util.Scanner;

public class WordMinMax {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static String[] splitWords(String str) {
        String[] words = new String[100];
        String word = "";
        int index = 0;

        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }
        if (!word.equals("")) {
            words[index++] = word;
        }

        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = splitWords(sentence);
        String shortest = words[0];
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (getLength(words[i]) < getLength(shortest)) {
                shortest = words[i];
            }
            if (getLength(words[i]) > getLength(longest)) {
                longest = words[i];
            }
        }
        System.out.println("\nShortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }
}
