import java.util.Scanner;
class TriArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double h = sc.nextDouble();
        double aCm = 0.5 * b * h;
        double aIn = aCm / (2.54 * 2.54);
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", aIn, aCm);
    }
}
