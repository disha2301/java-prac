/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
 */
import java.util.Scanner;
class HandShakes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        int maxHand = handshakeCalc(n);
        System.out.println("The maximum number of handshakes among " + n + 
                           " students is: " + maxHand);
    }
    public static int handshakeCalc(int n){
        return (n * (n - 1)) / 2;
    }
}