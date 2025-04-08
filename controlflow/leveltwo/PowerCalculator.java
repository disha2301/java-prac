import java.util.*;

class PowerCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        System.out.println("Enter power:");
        int pow = sc.nextInt();

        if (pow < 0) {
            System.out.println("Please enter a positive number as power.");
        } else {
            int res = 1, i = 1;

            // Calculate power using while loop
            while (i <= pow) {
                res *= num;
                i++;
            }

            System.out.println(num + " raised to the power " + pow + " is: " + res);
        }
    }
}
