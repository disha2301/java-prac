import java.util.Scanner;
class IntOp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();
        int res1 = a + b * c; 
        int res2 = a * b + c;  
        int res3 = c + a / b;  
        int res4 = a % b + c; 
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", res1, res2, res3, res4);
    }
}
