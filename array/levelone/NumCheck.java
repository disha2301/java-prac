/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
 */
import java.util.*;
class NumCheck{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is a positive even number.");
                } else {
                    System.out.println(num[i] + " is a positive odd number.");
                }
            } else if (num[i] < 0) {
                System.out.println(num[i] + " is a negative number.");
            } else {
                System.out.println(num[i] + " is zero.");
            }
        }
        if (num[0] > num[4]) System.out.println("First element is greater than last element.");
        else if (num[0] < num[4]) System.out.println("First element is less than last element.");
        else System.out.println("First and last elements are equal.");
    }
}