package com.gevernova.string.levelthree;

import java.util.Scanner;

public class SimpleCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);
    }

    static void printCalendar(int month, int year) {
        String[] months = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
                0, 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        System.out.println("\n     " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int startingDayOfWeek = getStartingDayOfWeek(month, year);

        for (int i = 0; i < startingDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%2d ", day);
            if ((day + startingDayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getStartingDayOfWeek(int month, int year) {
        int dayOfMonth = 1; // Always the 1st day of month
        if (month < 3) {
            month += 12;
            year--;
        }
        int yearOfCentury = year % 100;
        int century = year / 100;

        // Zeller’s Congruence formula
        int formulaResult = (dayOfMonth + (13 * (month + 1)) / 5 + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;

        // Convert Zeller's output to make 0 = Sunday
        return (formulaResult + 6) % 7;
    }
}
