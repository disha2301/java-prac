import java.io.*;

class PenDistribution {
    public static void main(String[] args) {
        // Total number of pens
        int total = 14;

        // Number of students
        int std = 3;

        // Calculate pens per student
        int perStd = total / std;

        // Calculate remaining pens
        int remaining = total % std;

        // Display the result
        System.out.println("The Pen Per Student is " + perStd + " and the remaining pen not distributed is " + remaining);
    }
}
