/*Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
 */
import java.util.Scanner;
class Bonus_17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        double sal = sc.nextDouble();
        System.out.println("Enter number of years served : ");
        int yrs = sc.nextInt();
        if(yrs > 5){
            System.out.println("You got a bonus of "+(0.05*sal));
            System.out.println("Total salary is "+(sal+sal*0.05));
        }
        else{
            System.out.println("Sorry, no bonus!\n Total salary is "+sal);
        }
    }
}