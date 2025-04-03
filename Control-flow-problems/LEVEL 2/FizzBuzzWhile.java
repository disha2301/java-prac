// Rewrite the program 4 FizzBuzz using the while loop
import java.util.*;
public class FizzBuzzWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        }
        else {
            int i=1;
            while(i<= n) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
                i++;
                }
            }
        }
    }


