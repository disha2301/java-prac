package com.gevernova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;

            while ((line = br.readLine()) != null) {
                if (!headerSkipped) { // skip header line
                    headerSkipped = true;
                    continue;
                }

                String[] values = line.split(",");

                if (values.length == 4) {
                    System.out.println("Student Details:");
                    System.out.println("ID    : " + values[0]);
                    System.out.println("Name  : " + values[1]);
                    System.out.println("Age   : " + values[2]);
                    System.out.println("Marks : " + values[3]);
                    System.out.println("-----------------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}