import java.util.*;

class LeapYearChecker { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year after 1582: ");
        int yr = sc.nextInt();

        // Part 1 – Using multiple if-else statements
        if (yr < 1582) {
            System.out.println("Invalid input! Year must be 1582 or later.");
        } else {
            if (yr % 400 == 0) {
                System.out.println(yr + " is a Leap Year (Checked using multiple if-else).");
            } else if (yr % 100 == 0) {
                System.out.println(yr + " is NOT a Leap Year (Checked using multiple if-else).");
            } else if (yr % 4 == 0) {
                System.out.println(yr + " is a Leap Year (Checked using multiple if-else).");
            } else {
                System.out.println(yr + " is NOT a Leap Year (Checked using multiple if-else).");
            }

            // Part 2 – Using a single if condition with logical operators
            if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
                System.out.println(yr + " is a Leap Year (Checked using single if + logical operators).");
            } else {
                System.out.println(yr + " is NOT a Leap Year (Checked using single if + logical operators).");
            }
        }
    }
}
