/*Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.*/
import java.util.Scanner;
class Factorial_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact=1;
        if(n<0)
        System.out.println("Not a positive number");
        else {
            if (n==0)
            fact = 1;
            else {
            int num=1;
            while(num<=n){
                fact*=num;
                num++;
            }
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
}

