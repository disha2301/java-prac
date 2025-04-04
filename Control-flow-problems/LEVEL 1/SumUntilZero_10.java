/*Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
 */
import java.util.Scanner;
class SumUntilZero_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number; 
        while (true) {
            System.out.print("Enter a value you may enter 0 to stop: ");
            number = sc.nextDouble(); 
            
            if (number == 0) {
                break; 
            }
            
            total += number; 
        }
        System.out.println("Total sum: " + total);
    }
}
