import java.util.Scanner;
class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double dFeet = sc.nextDouble();
        double dYards = dFeet / 3;
        double dMiles = dYards / 1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f%n", dYards, dMiles);
    }
}
