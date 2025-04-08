import java.util.*;

class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;            // To store the sum of cubes of digits
        int temp = number;      // Copy of the original number to work on

        // Loop to extract each digit and calculate cube
        while (temp != 0) {
            int d = temp % 10;         // Get last digit
            sum += d * d * d;          // Add cube of digit to sum
            temp /= 10;                // Remove last digit
        }

        // Check if the sum of cubes equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }
    }
}
