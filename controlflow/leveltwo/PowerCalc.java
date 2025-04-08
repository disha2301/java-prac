/*Create a program to find the power of a number.
Hint => 
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
 */
import java.util.*;
class PowerCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter power:");
        int pow = sc.nextInt();
        if (pow < 0) System.out.println("Please enter a positive number as power.");
        else {
            int res = 1;
            for (int i = 1; i <= pow; i++) {
                res *= num;
            }
            System.out.println(num + " raised to the power " + pow + " is: " + res);
        }
    }
}
