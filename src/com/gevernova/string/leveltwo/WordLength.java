package com.gevernova.string.leveltwo;
import java.util.Scanner;

public class WordLength {

    public static int getLength(String str) {
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

    public static String[] splitWords(String str) {
        String[] words = new String[100];
        String word = "";
        int wordIndex = 0;

        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[wordIndex] = word;
                word = "";
                wordIndex++;
            }
        }

        words[wordIndex] = word;
        String[] finalWords = new String[wordIndex + 1];
        for (int i = 0; i <= wordIndex; i++) {
            finalWords[i] = words[i];
        }

        return finalWords;
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = splitWords(sentence);
        String[][] table = getWordLengthTable(words);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        scanner.close();
    }
}
