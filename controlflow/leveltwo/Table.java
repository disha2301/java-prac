/*Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 
 */
import java.util.*;
class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        for(int i = 6; i<=9; i++){
            System.out.println(n+" times "+i+" is "+(n*i));
        }
    }
}