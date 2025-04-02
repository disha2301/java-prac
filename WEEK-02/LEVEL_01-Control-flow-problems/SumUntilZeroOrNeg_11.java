/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break; */
import java.util.Scanner;
class SumUntilZeroOrNeg_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number; 
        while (true) {
            System.out.print("Enter a value you may enter 0 or a negative number to stop: ");
            number = sc.nextDouble(); 
            
            if (number == 0 || number < 0) {
                break; 
            }
            
            total += number; 
        }
        System.out.println("Total sum: " + total);
    }
}

