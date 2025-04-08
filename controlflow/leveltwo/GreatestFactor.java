/*Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/
import java.util.*;
class GreatestFactor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if(n > 1){
            int greatestFactor = 1;
            for(int i = n-1; i>=1;i--){
                if(n%i == 0){
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor of "+n+" is "+greatestFactor);
        }
        else System.out.println("Kindly enter a number greater than 1");

    }
}