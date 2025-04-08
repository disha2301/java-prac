/*2. Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions. */
import java.util.*;
class StringReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
