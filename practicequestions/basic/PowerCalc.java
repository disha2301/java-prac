import java.util.Scanner;

class PowerCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and exponent values
        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power using Math.pow
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
