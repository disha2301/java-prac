package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter some text
        System.out.println("Enter a sentence with links:");
        String input = scanner.nextLine();

        // Regex pattern to match URLs starting with http:// or https://
        // This matches any text that starts with 'http' or 'https' followed by '://'
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+(?:/[a-zA-Z0-9./?=&%+_-]*)?\\b";

        // Compile and match the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Links found:");
        boolean found = false;

        // Loop through matches and print them
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No links found in the text.");
        }

        scanner.close();
    }
}