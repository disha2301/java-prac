import java.util.Scanner;

class HandshakeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int h = (n * (n - 1)) / 2;
        System.out.printf(
            "The maximum number of handshakes among %d students is %d%n",
            n, h
        );
    }
}
