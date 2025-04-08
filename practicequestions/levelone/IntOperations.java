import java.util.Scanner;

class IntOperations {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get values for a, b, and c from the user
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Perform the operations
        int res1 = a + b * c; 
        int res2 = a * b + c;  
        int res3 = c + a / b;  
        int res4 = a % b + c; 

        // Display the results of the operations
        System.out.println("The results of Int Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
    }
}
