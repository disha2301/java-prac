/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
 */
import java.util.*;
class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Enter a positive number!");
            return;
        }
        String res[] = new String[num];

        for (int i = 1; i <= num; i++) {
            String value = "";
            if (i % 3 == 0) value += "Fizz";
            if (i % 5 == 0) value += "Buzz";
            if (value.equals("")) value = String.valueOf(i);
            res[i - 1] = value;
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Position " + (i + 1) + " = " + res[i]);
        }
    }
}
