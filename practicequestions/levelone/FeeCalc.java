import java.util.Scanner;

class FeeCalc {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get the student fee and discount percentage from the user
        System.out.print("Enter the student fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double disPer = sc.nextDouble();

        // Calculate the discount amount
        double disAmt = (fee * disPer) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - disAmt;

        // Display the discount amount and the final discounted fee
        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
            disAmt, finalFee
        );
    }
}
