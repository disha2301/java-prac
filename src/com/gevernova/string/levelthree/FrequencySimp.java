package com.gevernova.string.levelthree;
import java.util.Scanner;
public class FrequencySimp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < text.length(); k++) {
                    if (text.charAt(k) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
            }
        }
    }
}
