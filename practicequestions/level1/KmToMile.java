import java.util.Scanner;
class KmToMile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double m = km / 1.6;
        System.out.printf("The total miles is %.2f miles for the given %.2f km%n", m, km);
    }
}
