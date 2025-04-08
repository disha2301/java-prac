/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/
import java.util.Scanner;
public class FrequencySimp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < text.length(); k++) {
                    if (text.charAt(k) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
            }
        }
    }
}
