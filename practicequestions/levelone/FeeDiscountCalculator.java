import java.io.*;

class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Initial fee and discount percentage
        double fee = 125000; // Original fee
        double discountPercent = 10; // Discount percentage

        // Calculate the discount amount
        double discountAmount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discountAmount;

        // Display the discount amount and the final fee
        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
            discountAmount, finalFee
        );
    }
}
