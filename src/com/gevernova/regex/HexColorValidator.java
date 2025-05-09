package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HexColorValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regex pattern to match a hex color: starts with # and has exactly 6 hex characters
        String regex = "^#[0-9A-Fa-f]{6}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Ask the user for input
        System.out.print("Enter a hex color code: ");
        String input = scanner.nextLine();

        // Match input with the pattern
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is a valid hex color code.");
        } else {
            System.out.println(input + " is NOT a valid hex color code.");
        }
    }
}