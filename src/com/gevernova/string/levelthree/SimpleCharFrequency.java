package com.gevernova.string.levelthree;
import java.util.Scanner;

public class SimpleCharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] freq = new int[256]; // For ASCII characters

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        };

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.printf("   %c     |    %d\n", (char)i, freq[i]);
            }
        }
    }
}
