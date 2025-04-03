import java.io.*;
class PL {
    public static void main(String[] args) {
        double cp = 129;
        double sp = 191;
        double p = sp-cp;
        double pPercentage = (p/sp) * 100;
        System.out.printf(
            "The Cost Price is INR %.2f and Selling Price is INR %.2f%n" +
            "The Profit is INR %.2f and the Profit Percentage is %.2f%n",
            cp, sp, p, pPercentage
        );
    }
}
