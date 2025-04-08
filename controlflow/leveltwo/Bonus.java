/*Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
 */
import java.util.Scanner;
class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yrs = sc.nextInt();

        if (yrs > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
            System.out.println("Total salary is "+(bonus+salary));
        } else {
            System.out.println("No bonus awarded.");
            System.out.println("Total salary is "+salary);
        }
    }
}
