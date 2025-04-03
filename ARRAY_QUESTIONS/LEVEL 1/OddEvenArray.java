/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
 */
import java.util.*;
public class OddEvenArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Enter a natural number");
            return;
        }
        int evenArr[] = new int[n / 2 + 1];
        int oddArr[] = new int[n / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenArr[evenIndex++] = i;
            } else {
                oddArr[oddIndex++] = i;
            }
        }
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}
