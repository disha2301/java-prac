/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
 */
import java.util.Scanner;

public class StringSplit {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int length = findLength(str);
        String word = "";
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount + 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }

        words[index] = word;
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] builtIn = input.split(" ");
        String[] custom = customSplit(input);

        System.out.println("Built-in split:");
        for (String word : builtIn) System.out.println(word);

        System.out.println("Custom split:");
        for (String word : custom) System.out.println(word);

        boolean same = compareArrays(builtIn, custom);
        System.out.println("Do they match? " + same);
    }
}
