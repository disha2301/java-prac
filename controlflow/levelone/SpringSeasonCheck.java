import java.util.Scanner;

class SpringSeasonCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take month and day as input
        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter date: ");
        int date = sc.nextInt();

        // Check if the date falls in Spring season (March 20 - June 20)
        if ((month == 3 && date >= 20) || (month == 4) || (month == 5) || (month == 6 && date <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
