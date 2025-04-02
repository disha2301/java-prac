/*Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number*/
import java.util.Scanner;
class OddEven_16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        if(n<=0)
        System.out.println("Enter a positive natural number");
        else{
            for(int i = 1;i<=n;i++){
                if(i%2 ==0)
                System.out.println(i+" is an even number");
                else
                System.out.println(i+" is an odd number");
            }
        }
    }
}
