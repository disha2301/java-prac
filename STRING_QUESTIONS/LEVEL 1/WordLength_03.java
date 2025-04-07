/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
 */
import java.util.*;
class WordLength_03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();

        String[] words = mySplit(s);
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