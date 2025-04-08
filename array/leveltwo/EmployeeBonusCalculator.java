import java.util.*;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();

            if (salaries[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Salary and years of service must be positive.");
                i--; // retry current employee
            }
        }

        for (int i = 0; i < 10; i++) {
            bonuses[i] = (yearsOfService[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("Total Bonus Payout: ₹" + totalBonus);
        System.out.println("Total Old Salary: ₹" + totalOldSalary);
        System.out.println("Total New Salary: ₹" + totalNewSalary);
    }
}
