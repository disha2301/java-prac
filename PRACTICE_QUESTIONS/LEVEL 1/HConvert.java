import java.util.Scanner;
class HConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54; 
        int feet = (int) (inches / 12);   
        double remainingInches = inches % 12; 
        System.out.printf(
            "Your Height in cm is %.2f while in feet is %d and inches is %.2f%n",
            cm, feet, remainingInches
        );
    }
}
