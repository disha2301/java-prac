/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
 */
import java.util.*;
class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n]; 
        int[] m = new int[n]; 
        double[] per = new double[n];
        String[] grade = new String[n];
        String[] remarks = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            a[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            b[i] = sc.nextInt();
            System.out.print("Maths: ");
            m[i] = sc.nextInt();

            per[i] = (a[i] + b[i] + m[i]) / 3.0;

            if (per[i] >= 80) {
                grade[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (per[i] >= 70) {
                grade[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (per[i] >= 60) {
                grade[i] = "C";
                remarks[i] = "Level 2, but approaching agency-normalized standards";
            } else if (per[i] >= 50) {
                grade[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (per[i] >= 40) {
                grade[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - Percentage: " + per[i] + "%, Grade: " + grade[i] + ", Remarks: " + remarks[i]);
        }
    }
}