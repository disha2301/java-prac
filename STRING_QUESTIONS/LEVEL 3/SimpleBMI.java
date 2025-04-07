/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 */
import java.util.Scanner;

public class SimpleBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop for 3 people
        for (int i = 1; i <= 3; i++) {
            System.out.println("Person " + i + ":");
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter height in cm: ");
            double heightCm = sc.nextDouble();
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            System.out.printf("BMI: %.2f\n", bmi);
            if (bmi < 18.5) {
                System.out.println("Status: Underweight\n");
            } else if (bmi < 25) {
                System.out.println("Status: Normal\n");
            } else if (bmi < 30) {
                System.out.println("Status: Overweight\n");
            } else {
                System.out.println("Status: Obese\n");
            }
        }
    }
}
