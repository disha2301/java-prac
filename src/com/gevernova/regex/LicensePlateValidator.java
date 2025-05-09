package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LicensePlateValidator {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner sc = new Scanner(System.in);

        // Define the regex: 2 uppercase letters followed by 4 digits
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // Compile the regex into a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Prompt the user to enter a license plate number
        System.out.print("Enter license plate number: ");
        String input = sc.nextLine();

        // Check if the input matches the pattern
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is a valid license plate number.");
        } else {
            System.out.println(input + " is NOT a valid license plate number.");
        }

    }
}