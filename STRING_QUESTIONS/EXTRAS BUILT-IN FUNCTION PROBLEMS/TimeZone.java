/*1. Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones. */
import java.time.ZonedDateTime;
import java.time.ZoneId;
class TimeZone{
    public static void main(String args[]){
       System.out.println("GMT time :  "+ZonedDateTime.now(ZoneId.of("GMT")));
       System.out.println("IST time : "+ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
       System.out.println("PST time : "+ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}