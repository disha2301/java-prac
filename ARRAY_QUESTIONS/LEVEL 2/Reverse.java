/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int freq[] = new int[10]; // Array to store digit frequencies

        while (num > 0) {
            int digit = num % 10; // Get last digit
            freq[digit]++; // Increase count for that digit
            num /= 10; // Remove last digit
        }

        // Print frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    } */
import java.util.*;
class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int c = 0, temp = n;

        while (temp != 0) {
            c++;
            temp /= 10;
        }

        int arr[] = new int[c];
        temp = n;

        for (int i = 0; i < c; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < c; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
