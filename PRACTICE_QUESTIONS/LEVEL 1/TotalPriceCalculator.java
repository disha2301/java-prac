import java.util.Scanner;
class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price (INR): ");
        double up = sc.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int q = sc.nextInt();
        double totalPrice = up * q;
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPrice, q, up);
    }
}
