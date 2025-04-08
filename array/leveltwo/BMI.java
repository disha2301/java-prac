/* An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
 */
import java.util.*;
class BMI{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        double h[] = new double[n]; 
        double w[] = new double[n]; 
        double bmi[] = new double[n];
        String status[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (meters): ");
            h[i] = sc.nextDouble();
            System.out.print("Weight (kg): ");
            w[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] > 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] > 25 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + h[i] + " meters");
            System.out.println("Weight: " + w[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }
    }
}
