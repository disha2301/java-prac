/*Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
Hint => 
Get integer input from the user and store it in the age variable.
If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
 */
import java.util.Scanner;
class VoteCheck_05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
    
}
