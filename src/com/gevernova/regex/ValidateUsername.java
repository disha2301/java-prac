package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String regex = "^[a-zA-Z0-9_]{4,15}$";
        Pattern pattern = Pattern.compile(regex);
        System.out.print("Enter the username : ");
        String username = scanner.nextLine();
        Matcher matcher = pattern.matcher(username);
        if (matcher.matches()) {
            System.out.println(username + "' is a valid username.");
        } else {
            System.out.println(username+ " is NOT a valid username.");
        }
    }
}
