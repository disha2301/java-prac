/*Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter. */
import java.util.Scanner;
class Counter_08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown starting value : ");
        int n = sc.nextInt();
        while(n>=1){
            System.out.println(n);
            n--;
        }
        System.out.println("Launching now!");
    }
    
}
