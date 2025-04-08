import java.util.*;

class DayOfWeekCalculator {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take month, day, and year as input
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int yr = sc.nextInt();

        // Adjust month and year for Zeller’s Congruence
        if (m < 3) {
            m += 12;
            yr--;
        }

        int cent = yr / 100;        // Century part of the year
        int yrCent = yr % 100;      // Year within the century

        // Zeller’s Congruence formula to calculate day of week
        int dayOfWeek = (d + (13 * (m + 1)) / 5 + yrCent + (yrCent / 4) + (cent / 4) + (5 * cent)) % 7;

        // Mapping index to day name
        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        // Output result
        System.out.println("The day of the week is: " + days[dayOfWeek]);

    }
}
