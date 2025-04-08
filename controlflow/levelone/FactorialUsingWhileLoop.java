import java.util.Scanner;

class FactorialUsingWhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;

        // Check if the number is positive
        if (n < 0) {
            System.out.println("Not a positive number");
        } else {
            // Calculate factorial using while loop
            int num = 1;
            while (num <= n) {
                fact *= num;
                num++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}
