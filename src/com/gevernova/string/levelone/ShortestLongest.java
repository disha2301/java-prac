package com.gevernova.string.levelone;
import java.util.*;

class ShortestLongest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String string = scanner.nextLine();
        
        // Split the sentence into words
        String[] words = mySplit(string);
        
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
