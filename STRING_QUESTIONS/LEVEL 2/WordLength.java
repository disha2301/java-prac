/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
 */
import java.util.Scanner;

public class WordLength {

    public static int getLength(String str) {
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

    public static String[] splitWords(String str) {
        String[] words = new String[100];
        String word = "";
        int wordIndex = 0;

        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[wordIndex] = word;
                word = "";
                wordIndex++;
            }
        }

        words[wordIndex] = word;
        String[] finalWords = new String[wordIndex + 1];
        for (int i = 0; i <= wordIndex; i++) {
            finalWords[i] = words[i];
        }

        return finalWords;
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = splitWords(sentence);
        String[][] table = getWordLengthTable(words);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        sc.close();
    }
}
