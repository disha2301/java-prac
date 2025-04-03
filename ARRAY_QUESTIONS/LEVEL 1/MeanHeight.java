/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
 */
import java.util.*;
class MeanHeight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double h[] = new double[11];
        double total = 0.0;

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            h[i] = sc.nextDouble();
            total += h[i];
        }
        double meanHeight = total / 11;
        System.out.println("\nMean height of the football team: " + meanHeight + " cm");
    }
}
