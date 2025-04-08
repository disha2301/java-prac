import java.util.*;

public class OddEvenArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number (positive integer)
        if (n < 1) {
            System.out.println("Enter a natural number");
            return;
        }

        // Create arrays to store even and odd numbers
        // Max possible size is roughly half of n + 1
        int evenArr[] = new int[n / 2 + 1];
        int oddArr[] = new int[n / 2 + 1];

        // Index counters for each array
        int evenIndex = 0, oddIndex = 0;

        // Loop from 1 to n and separate numbers into even or odd arrays
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenArr[evenIndex++] = i; // Store even numbers
            } else {
                oddArr[oddIndex++] = i;  // Store odd numbers
            }
        }

        // Display even numbers
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }

        // Display odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}
