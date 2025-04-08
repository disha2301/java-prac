/*Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):

 */
import java.util.*;
class DayOfWeek {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int yr = sc.nextInt();

        if (m < 3) {
            m += 12;
            yr--;
        }

        int cent = yr / 100;
        int yrCent = yr % 100;

        int dayOfWeek = (d + (13 * (m + 1)) / 5 + yrCent + (yrCent / 4) + (cent / 4) + (5 * cent)) % 7;

        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        System.out.println("The day of the week is: " + days[dayOfWeek]);

        sc.close();
    }
}