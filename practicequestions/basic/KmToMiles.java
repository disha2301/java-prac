import java.util.Scanner;

class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kms = scanner.nextDouble();

        // Convert to miles
        double miles = kms * 0.621371;

        // Output the result
        System.out.printf("%.2f km is equal to %.2f miles%n", kms, miles);
    }
}
