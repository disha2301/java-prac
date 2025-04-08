/*Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
 */
import java.util.Scanner;

public class LeapYearChecker {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        // Condition: Year must be divisible by 4 and not by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Validate year
        if (year < 1582) {
            System.out.println("Please enter a year from 1582 onwards (Gregorian calendar).");
        } else {
            // Check and display result
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
}