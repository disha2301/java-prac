/*3. Prime Number Checker:
○ Create a program that checks whether a given number is a prime number. ○
The program should use a separate function to perform the prime check and
return the result. */

import java.util.Scanner;

class PrimeCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if(isPrime(n))
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
    public static boolean isPrime(int num){
        for(int i = 2; i<=num/2;i++){
            if(num%i == 0)
            return false;
        }
        return true;
    }
}