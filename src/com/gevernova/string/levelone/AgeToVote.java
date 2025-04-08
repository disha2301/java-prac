package com.gevernova.string.levelone;
import java.util.*;
class AgeToVote{
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

