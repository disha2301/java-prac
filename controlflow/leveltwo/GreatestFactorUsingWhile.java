/*Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
 */
import java.util.*;
class GreatestFactorUsingWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if(n > 1){
            int greatestFactor = 1;
            int i = n-1;
            while(i>=1){
                if(n%i == 0){
                    greatestFactor = i;
                    break;
                }
                i--;
            }
            System.out.println("Greatest factor of "+n+" is "+greatestFactor);
        }
        else System.out.println("Kindly enter a number greater than 1");

    }
}
