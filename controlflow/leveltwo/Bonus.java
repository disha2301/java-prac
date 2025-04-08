import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get employee's salary as input
        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();
        
        // Get years of service as input
        System.out.print("Enter years of service: ");
        int yrs = sc.nextInt();

        // Check if years of service is more than 5 to award bonus
        if (yrs > 5) {
            double bonus = 0.05 * salary; // Calculate 5% bonus
            System.out.println("Bonus amount: " + bonus);
            System.out.println("Total salary is " + (bonus + salary));
        } else {
            System.out.println("No bonus awarded.");
            System.out.println("Total salary is " + salary);
        }
    }
}
