/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
 */
import java.util.Scanner; // Import Scanner class to take user input

class SimpleInterest {

    // Method to calculate Simple Interest
    // Formula: (Principal * Rate * Time) / 100
    public static double interestCalc(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String args[]) {
        // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter Principal amount
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble(); // Store input in 'principal'

        // Prompt user to enter Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble(); // Store input in 'rate'

        // Prompt user to enter Time in years
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble(); // Store input in 'time'

        // Call the interestCalc method and store the result
        double interest = interestCalc(principal, rate, time);

        // Display the final Simple Interest along with input values
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time + " years.");
    }
}
