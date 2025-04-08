import java.util.Scanner;

public class NumberChecker {

    // Count number of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Store digits in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int i = count - 1;
        while (number > 0) {
            digits[i] = number % 10;
            number = number / 10;
            i--;
        }
        return digits;
    }

    // Check if it's a Duck number
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Check if Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // Find largest digit
    public static int findLargest(int[] digits) {
        int max = digits[0];
        for (int d : digits) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    // Find smallest digit
    public static int findSmallest(int[] digits) {
        int min = digits[0];
        for (int d : digits) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigits(number, count);

        System.out.println("Digit count: " + count);
        System.out.println("Duck Number: " + (isDuck(digits) ? "Yes" : "No"));
        System.out.println("Armstrong Number: " + (isArmstrong(number, digits) ? "Yes" : "No"));
        System.out.println("Largest Digit: " + findLargest(digits));
        System.out.println("Smallest Digit: " + findSmallest(digits));
    }
}
