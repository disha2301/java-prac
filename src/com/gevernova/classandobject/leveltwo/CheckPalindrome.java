package com.gevernova.classandobject.leveltwo;

public class CheckPalindrome {

    // Attribute
    String text;

    // Constructor to initialize the text
    public CheckPalindrome(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome (simplified)
    public boolean isPalindrome() {
        String lowerText = text.toLowerCase();
        int left = 0;
        int right = lowerText.length() - 1;

        while (left < right) {
            if (lowerText.charAt(left) != lowerText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void printDetails() {
        System.out.println("Input Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result    : It's a palindrome!");
        } else {
            System.out.println("Result    : Not a palindrome.");
        }
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Example inputs
        CheckPalindrome obj = new CheckPalindrome("Madam");

        // Display results
        obj.printDetails();
    }
}
