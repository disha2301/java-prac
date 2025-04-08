import java.util.Scanner;
class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();
        double res1 = a + b * c; 
        double res2 = a * b + c;  
        double res3 = c + a / b; 
        double res4 = a % b + c;  
		System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", res1, res2, res3, res4);
    }
}
