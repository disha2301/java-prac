/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 */
import java.util.*;
class AgeToVote_08{
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int n = sc.nextInt();
            
            int[] ages = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter age of student " + (i + 1) + ":");
                ages[i] = sc.nextInt();
            }
            
            String[][] votingStatus = checkVoting(ages);
            
            for (String[] row : votingStatus) {
                System.out.println("Age: " + row[0] + " - " + row[1]);
            }
        }
    
        public static String[][] checkVoting(int[] ages) {
            String[][] status = new String[ages.length][2];
            for (int i = 0; i < ages.length; i++) {
                status[i][0] = String.valueOf(ages[i]);
                status[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
            }
            return status;
        }
    }

