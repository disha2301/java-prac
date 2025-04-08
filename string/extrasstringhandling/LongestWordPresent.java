
/*5. Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/
import java.util.*;
class LongestWordPresent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine() + " "; // extra space to process last word

        String word = "", longest = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = ""; // reset for next word
            }
        }

        System.out.println("Longest word is: " + longest);
    }
}
