import java.util.Scanner;
class Fee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student fee (INR): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double disPer = sc.nextDouble();
        double disAmt = (fee * disPer) / 100;
        double finalFee = fee - disAmt;
        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
            disAmt, finalFee
        );
    }
}
