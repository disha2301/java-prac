package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Regex: starts with a letter, followed by 4 to 14 allowed characters (total 5 to 15)
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            System.out.println(username + " is a valid username.");
        } else {
            System.out.println(username + " is NOT a valid username.");
        }

        sc.close();
    }
}