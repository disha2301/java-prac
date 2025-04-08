package com.gevernova.string.extrasbuiltin;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class DateFormatter{
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dft3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 1 : " +now.format(dtf1));
        System.out.println("Format 2 : " +now.format(dtf2));
        System.out.println("Format 3 : "+now.format(dft3));
    
    }
}