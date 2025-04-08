import java.util.*;

class BMICalculator {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Get height in centimeters
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI using formula: weight / (height in meters)^2
        double bmi = weight / (heightM * heightM);

        // Determine weight status based on BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi > 18.5 && bmi <= 24.9) {
            status = "Normal weight";
        } else if (bmi > 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and weight status
        System.out.println("Your BMI: " + String.format("%.2f", bmi));
        System.out.println("Weight Status: " + status);
    }
}
