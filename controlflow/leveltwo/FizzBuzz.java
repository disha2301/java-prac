import java.util.*;

public class FizzBuzz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        // Check for valid positive input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to n and apply FizzBuzz logic
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }
}
