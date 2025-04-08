/*2. Maximum of Three Numbers:
○ Write a program that takes three integer inputs from the user and finds the
maximum of the three numbers.
○ Ensure your program follows best practices for organizing code into modular
functions, such as separate functions for taking input and calculating the
maximum value. */
import java.util.*;
class MaxofThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter value of number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter value of number 3 : ");
        int c = sc.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("Maximum value is : "+max);

    }
}