import java.util.Scanner;

public class KmsToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kms = scanner.nextDouble();
        double ms= kms * 0.621371;
        System.out.printf("%.2f km is equal to %.2f miles%n", kms, ms);
    }
}
