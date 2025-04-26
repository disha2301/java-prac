import java.util.Scanner;
import java.util.Arrays;

public class NumberOperation {

    // Method to count the digits in the number
public static int countDigits(int number) {
    int count = 0;
    if (number == 0) return 1;  // Special case: 0 has 1 digit
    while (number != 0) {
        number /= 10;
        count++;
    }
    return count;
}

    // Method to store digits in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test the utility
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = countDigits(number);
        int[] digits = getDigits(number, count);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Palindrome: " + (isPalindrome(digits) ? "Yes" : "No"));
        System.out.println("Is Duck Number: " + (isDuckNumber(digits) ? "Yes" : "No"));
    }
}
