/*Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
*/
import java.util.Scanner;
class Factorial_15{
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
                for(int i=1;i<=n;i++)
                fact*=i;
            }
            System.out.println("Factorial of "+n+" is "+fact);
        }

        
    }
}

