/*9. Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"

Expected Output:
Most Frequent Character: 's'
*/
import java.util.Scanner;
class FrequentChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch] > maxCount){
                maxChar = ch;
                maxCount = freq[ch];
            }
        }
        System.out.println("Most frequent character is "+maxChar+" that has occured "+ maxCount+" times");
    }
}
