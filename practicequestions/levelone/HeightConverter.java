import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get the height in centimeters from the user
        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextDouble();

        // Convert the height from centimeters to inches
        double inches = cm / 2.54; 

        // Convert the total inches into feet and remaining inches
        int feet = (int) (inches / 12);   
        double remainingInches = inches % 12; 

        // Display the height in centimeters, feet, and remaining inches
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}
