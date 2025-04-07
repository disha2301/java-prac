/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
 */
import java.util.*;

class ShortestLongest_04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        
        // Split the sentence into words
        String[] words = mySplit(s);
        
        // Create a 2D array with words and their lengths
        String[][] wordLengths = getWordLengths(words);
        
        // Find shortest and longest words
        String[] shortLong = findShortLong(wordLengths);
        
        // Display the result
        System.out.println("Shortest word is \"" + shortLong[0] + "\" and longest word is \"" + shortLong[1] + "\""); 
    }

    // Method to find the length of a string without using length()
    public static int myLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the string into words manually
    public static String[] mySplit(String str) {
        int len = myLength(str);
        int wordCount = 1;

        // Count words by checking spaces
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        // Extract words manually
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start, len);

        return words;
    }

    // Method to create a 2D array containing words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(myLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find the shortest and longest words
    public static String[] findShortLong(String[][] wordLen) {
        String shortest = wordLen[0][0];
        String longest = wordLen[0][0];
        int minLen = Integer.parseInt(wordLen[0][1]);
        int maxLen = Integer.parseInt(wordLen[0][1]);

        for (int i = 1; i < wordLen.length; i++) {
            int length = Integer.parseInt(wordLen[i][1]);
            if (length < minLen) {
                minLen = length;
                shortest = wordLen[i][0];
            }
            if (length > maxLen) {
                maxLen = length;
                longest = wordLen[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
}
