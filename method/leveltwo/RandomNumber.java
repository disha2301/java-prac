/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers)  */
import java.util.Arrays;
public class RandomNumber {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // Method to calculate average, min and max of the array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Print the generated numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Calculate average, min, and max
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int) stats[1]);
        System.out.println("Maximum: " + (int) stats[2]);
    }
}
