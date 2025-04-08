/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
 */
import java.util.Scanner;
class BMI2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");

            do {
                System.out.print("Height (m): ");
                data[i][0] = sc.nextDouble();
            } while (data[i][0] <= 0);

            do {
                System.out.print("Weight (kg): ");
                data[i][1] = sc.nextDouble();
            } while (data[i][1] <= 0);

            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);

            if (data[i][2] <= 18.4) status[i] = "Underweight";
            else if (data[i][2] <= 24.9) status[i] = "Normal";
            else if (data[i][2] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": " + "H: " + data[i][0] + "m, W: " + data[i][1] + "kg, BMI: " + data[i][2] + ", Status: " + status[i]);
        }
    }
}
