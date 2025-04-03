import java.io.*;
class AvgMarks {
    public static void main(String[] args) {
      
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double avg = (maths + physics + chemistry) / 3.0;
        System.out.printf("Sam’s average mark in PCM is %.2f%n", avg);
    }
}
