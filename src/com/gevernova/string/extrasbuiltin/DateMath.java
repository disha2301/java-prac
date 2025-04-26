package com.gevernova.string.extrasbuiltin;

import java.time.LocalDate;
import java.util.Scanner;
class DateMath{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in (yyyy-mm-dd) format");
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date); // convert to local date
        LocalDate add = localDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years we get : "+add);
        LocalDate result = add.minusWeeks(3);
        System.out.println("After removing 3 weeks we get : "+result);
    }
}