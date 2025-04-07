/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
 */
import java.util.*;
class Frequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
    
            int freq[] = new int[10]; 
    
            while (num > 0) {
                int digit = num % 10; 
                freq[digit]++; 
                num /= 10;
            }
            System.out.println("Digit Frequency:");
            for (int i = 0; i < 10; i++) {
                if (freq[i] > 0) {
                    System.out.println(i + " -> " + freq[i]);
                }
            }
        }
    }
