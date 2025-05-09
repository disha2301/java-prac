package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter some text
        System.out.println("Enter a sentence with dates (dd/mm/yyyy):");
        String input = scanner.nextLine();

        // Regex pattern to match dd/mm/yyyy format
        // \b ensures we match whole words, \d{2} for day/month, \d{4} for year
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Compile and match the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Dates found:");
        boolean found = false;

        // Loop through matches and print them
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No dates found in the text.");
        }

        scanner.close();
    }
}