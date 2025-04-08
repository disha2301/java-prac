/*Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical  */
import java.util.*;
class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year after 1582");
        int yr = sc.nextInt();
        if (yr < 1582) System.out.println("Invalid input!");
        else{
            if (yr % 400 == 0) {
                System.out.println(yr + " is a Leap Year");
            } else if (yr % 100 == 0) {
                System.out.println(yr + " is NOT a Leap Year");
            } else if (yr % 4 == 0) {
                System.out.println(yr + " is a Leap Year");
            } else {
                System.out.println(yr + " is NOT a Leap Year");
            }
        }
    }     
}