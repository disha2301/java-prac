/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
 */
import java.util.*;
class Grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int m3 = sc.nextInt();
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
            System.out.println("Invalid marks entered!");
        } else {
            int total = m1+m2+m3;
            double per = total / 3.0;
            String grade, remarks;
            if (per >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (per >= 70 && per <= 79) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (per >= 60 && per <= 69) {
                grade = "C";
                remarks = "Level 2, but approaching agency-normalized standards";
            } else if (per >= 50 && per <= 59) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (per >= 40 && per <= 49) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            System.out.println("Physics: " + m1);
            System.out.println("Chemistry: " + m2);
            System.out.println("Maths: " + m3);
            System.out.println("Total Marks: " + total + "/300");
            System.out.println("Percentage: " + per + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}