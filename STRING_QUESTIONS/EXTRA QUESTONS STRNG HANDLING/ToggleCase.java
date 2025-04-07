/*7. Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa. */
import java.util.*;
class ToggleCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // Convert to lowercase
            }
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // Convert to uppercase
            }
            else {
                result += ch;
            }
        }

        System.out.println("Toggled string: " + result);
    }
}
