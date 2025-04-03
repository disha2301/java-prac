/*Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
 */
import java.util.*;
class Table{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int table[] = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " times " + i +" is "+ table[i - 1]);
        }
    }
}