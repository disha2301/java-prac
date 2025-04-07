/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
 */
import java.util.*;
public class Comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + name[i] + ": ");
            age[i] = sc.nextInt();
            
            System.out.print("Enter height of " + name[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }
        int youngest = 0;
        int tallest = 0;
        
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }
        System.out.println("Youngest friend: " + name[youngest] + " (Age: " + age[youngest] + ")");
        System.out.println("Tallest friend: " + name[tallest] + " (Height: " + height[tallest] + " cm)");
    }
    
}
