/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
 */
import java.util.Scanner;
public class EasyTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += text.charAt(i);
        }
        String builtInTrim = text.trim();
        System.out.println("\nCustom Trimmed : '" + trimmed + "'");
        System.out.println("Built-in Trim  : '" + builtInTrim + "'");
        System.out.println("Are they same? : " + trimmed.equals(builtInTrim));
    }
}
