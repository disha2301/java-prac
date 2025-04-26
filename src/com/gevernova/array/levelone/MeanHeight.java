import java.util.*;

class MeanHeight {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store heights of 11 players
        double height[] = new double[11];

        // Variable to store the sum of all heights
        double total = 0.0;

        // Loop to get height input from user
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            height[i] = scanner.nextDouble(); // Store input in array
            total += height[i];          // Add to total
        }

        // Calculate mean height
        double meanHeight = total / 11;

        // Display result
        System.out.println("\nMean height of the football team: " + meanHeight + " cm");
    }
}
