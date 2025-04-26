package com.gevernova.string.levelthree;
import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String textOne, String textTwo) {
        if (textOne.length() != textTwo.length()) return false;

        int[] freqOne = new int[256];
        int[] freqtwo = new int[256];

        for (int i = 0; i < textOne.length(); i++) {
            freqOne[textOne.charAt(i)]++;
            freqtwo[textTwo.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freqOne[i] != freqtwo[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        String str2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.println(isAnagram(str1, str2));
    }
}
