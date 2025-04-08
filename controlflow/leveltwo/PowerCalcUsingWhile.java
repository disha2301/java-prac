/*Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint => 
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop. */
import java.util.*;
class PowerCalcUsingWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter power:");
        int pow = sc.nextInt();
        if (pow < 0) System.out.println("Please enter a positive number as power.");
        else {
            int res = 1,i = 1;
            while(i <= pow){
                res *= num;
                i++;
            }
            System.out.println(num + " raised to the power " + pow + " is: " + res);
        }
    }
}

