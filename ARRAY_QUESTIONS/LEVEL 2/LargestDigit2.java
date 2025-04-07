/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
 */
import java.util.*;
class LargestDigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int size = 10, idx = 0, max = 0, secondMax = 0;
        int[] d = new int[size];

        while (n > 0) {
            if (idx == size) {
                size += 10;
                int[] temp = new int[size];
                for (int i = 0; i < d.length; i++) {
                    temp[i] = d[i];
                }

                d = temp;
            }
            d[idx++] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < idx; i++) {
            if (d[i] > max) {
                secondMax = max;
                max = d[i];
            } else if (d[i] > secondMax && d[i] != max) {
                secondMax = d[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondMax);
        sc.close();
    }
}
