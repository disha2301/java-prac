/*Write a program to find the first non-repeating character in a string and show the result
Hint => 
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using the charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result. 
 */
import java.util.Scanner;

public class SimpleNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < text.length(); j++) {
                if (i != j && current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First non-repeating character: " + current);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
