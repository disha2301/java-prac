import java.util.Scanner;
class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double dFeet = sc.nextDouble();
        double dYard = dFeet / 3;   
        double dMile = dYard / 1760;  
        System.out.printf(
            "The distance in feet is %.2f ft, in yards is %.2f yd, and in miles is %.6f mi%n",
            dFeet, dYard, dMile
        );
    }
}
