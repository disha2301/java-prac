/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
 */
import java.util.Scanner;
class SimpleInterest{
    public static double interestCalc(double p, double r, double t){
        return (p * r * t) / 100;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double interest = interestCalc(principal, rate, time);
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time + " years.");
    }
    
}