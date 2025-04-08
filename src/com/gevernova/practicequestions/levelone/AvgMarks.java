package com.gevernova.practicequestions.levelone;
import java.io.*;

class AvgMarks {
    public static void main(String[] args) {
        // Define the marks for each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate the average marks
        double avg = (maths + physics + chemistry) / 3.0;

        // Output the result with 2 decimal precision
        System.out.printf("Sam’s average mark in PCM is %.2f%n", avg);
    }
}
