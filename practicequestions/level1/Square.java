import java.util.Scanner;
class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double peri = sc.nextDouble();
        double s = peri / 4;
        System.out.printf(
            "The length of the side is %.2f whose perimeter is %.2f%n",
            s, peri
        );
    }
}
