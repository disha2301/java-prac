package com.gevernova.string.extrasbuiltin;
import java.time.LocalDate;
import java.util.Scanner;
class DateComparision{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date 1 in (yyyy-mm-dd) format : ");
        String dateOne = scanner.nextLine();
        System.out.print("Enter date 2 in (yyyy-mm-dd) format : ");
        String dateTwo = scanner.nextLine();

        LocalDate localDateOne = LocalDate.parse(dateOne);
        LocalDate localDateTwo = LocalDate.parse(dateTwo);

        if(localDateOne.isBefore(localDateTwo)){
            System.out.println("The first date comes before");
        }
        else if(localDateOne.isAfter(localDateTwo)){
            System.out.println("The first date comes after");
        }
        else if(localDateOne.isEqual(localDateTwo)){
            System.out.println("Both dates are same");
        }
    }
}