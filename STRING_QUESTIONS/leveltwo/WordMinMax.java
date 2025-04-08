/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
 */
import java.util.Scanner;

public class WordMinMax {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static String[] splitWords(String str) {
        String[] words = new String[100];
        String word = "";
        int index = 0;

        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }
        if (!word.equals("")) {
            words[index++] = word;
        }

        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = splitWords(sentence);
        String shortest = words[0];
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (getLength(words[i]) < getLength(shortest)) {
                shortest = words[i];
            }
            if (getLength(words[i]) > getLength(longest)) {
                longest = words[i];
            }
        }
        System.out.println("\nShortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }
}
