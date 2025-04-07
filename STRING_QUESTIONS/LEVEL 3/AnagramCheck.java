/*Write a program to check if two texts are anagrams and display the result
Hint => 
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result. 
 */
import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.println(isAnagram(str1, str2));
    }
}
