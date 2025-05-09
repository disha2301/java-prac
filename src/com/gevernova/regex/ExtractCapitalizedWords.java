package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Regex pattern: word starting with capital letter followed by lowercase letters
        String regex = "\\b[A-Z][a-z]*\\b";

        // Compile and match the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Capitalized words found:");
        boolean found = false;

        // Print all matching capitalized words
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No capitalized words found.");
        }

        scanner.close();
    }
}