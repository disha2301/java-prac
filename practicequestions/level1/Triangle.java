import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double h = sc.nextDouble();
        double cmToInches = 0.155;
        double acm = 0.5 * b * h;
        double aIn = acm * cmToInches;
        System.out.printf(
            "The area of the triangle is %.2f cm² and %.2f in²%n",
            acm, aIn
        );
    }
}
