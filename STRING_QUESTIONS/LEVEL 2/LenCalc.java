/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result */
import java.util.Scanner;

public class LenCalc {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int manualLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Manual length (without using length()): " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
        scanner.close();
    }
}
