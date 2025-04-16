package com.gevernova.searching.linear;
import java.util.Scanner;

public class WordSearch {

    // method to perform linear search to find the required word
    public static String findSentenceWithWord(String[] sentences, String word){
        // loop through all sentences
        for(int i = 0; i < sentences.length; i++){
            // check if current sentence has the word
            if(sentences[i].toLowerCase().contains(word.toLowerCase())){
                return sentences[i]; // return thr first matching sentence
            }
        }
        return "Not Found";
    }

    // main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of sentences : ");
        int n = sc.nextInt();
        String[] sentences = new String[n];
        // Input all sentences
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }
        // Input the word to search
        System.out.print("Enter the word to search for: ");
        String word = sc.nextLine();
        // Search and print result
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);
    }
}
