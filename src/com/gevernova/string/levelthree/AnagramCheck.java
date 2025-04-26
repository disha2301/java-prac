package com.gevernova.string.levelthree;
import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
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
