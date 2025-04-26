package com.gevernova.string.levelone;
import java.util.*;
class WordLength{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String string = scanner.nextLine();

        String[] words = mySplit(string);
        String[][] wordLengths = getWordLengths(words);

        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + " has " + wordLengths[i][1]+" characters");
        }
    }
    public static int myLength(String s1){
        int count = 0;
        try {
            while (true) {
                s1.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count; 
        }
    }
    public static String[] mySplit(String s1){
        int len = myLength(s1);
        int wordCount=1;
        for(int i=0;i<len;i++){
            if(s1.charAt(i)==' '){
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) == ' ') {
                words[wordIndex++] = s1.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = s1.substring(start, len);
        return words;
    }
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(myLength(words[i])); 
        }
        return wordLengths;
    }
}