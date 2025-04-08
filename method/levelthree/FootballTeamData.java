import java.util.Random;
import java.util.Scanner;

public class FootballTeamData {

   // Method to generate random heights between 150 and 250 for 'size' players
public static int[] generateRandomHeights(int size) {
    int[] heights = new int[size];         // Create array to hold heights
    for (int i = 0; i < size; i++) {
        heights[i] = (int)(Math.random() * 101) + 150; // Random number from 150 to 250
    }
    return heights;
}

    // Method to calculate sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11); // 11 players

        System.out.println("Heights of players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = calculateMean(heights);

        System.out.println("\nShortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");
        System.out.printf("Mean player height: %.2f cm\n", mean);
    }
}
