import java.util.Scanner;

class CheckNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking each number
        System.out.println("\nAnalysis of Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (isPositive(n)) {
                System.out.print(n + " is Positive and ");
                if (isEven(n)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(n + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison between first (" + numbers[0] + 
                         ") and last (" + numbers[4] + ") element: ");

        if (result == 1)
            System.out.println("First number is greater.");
        else if (result == 0)
            System.out.println("Both numbers are equal.");
        else
            System.out.println("First number is smaller.");
    }

    // Method to check if number is positive
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }
}
