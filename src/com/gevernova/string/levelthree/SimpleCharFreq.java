package com.gevernova.string.levelthree;
import java.util.Scanner;

public class SimpleCharFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < input.length(); k++) {
                    if (input.charAt(k) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
            }
        }
    }
}
