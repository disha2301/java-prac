import java.util.Scanner; 
class TableGenerator {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter any number: ");
        
        // Read the integer input from the user and store it in variable 'n'
        int n = sc.nextInt();

        // Loop from 6 to 9 to generate the multiplication table
        for (int i = 6; i <= 9; i++) {
            // Print the result of multiplication in the format "n * i = result"
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
