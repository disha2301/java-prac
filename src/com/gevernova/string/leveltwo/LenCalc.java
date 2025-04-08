package com.gevernova.string.leveltwo;
import java.util.Scanner;

public class LenCalc {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int manualLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Manual length (without using length()): " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
        scanner.close();
    }
}
