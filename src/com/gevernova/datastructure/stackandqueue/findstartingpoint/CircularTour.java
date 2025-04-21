package com.gevernova.datastructure.stackandqueue.findstartingpoint;

public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0;
        int currentBalance = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int gain = petrol[i] - distance[i];
            totalSurplus += gain;
            currentBalance += gain;

            // If current balance drops below zero, can't start from current start
            if (currentBalance < 0) {
                start = i + 1;         // Move starting point
                currentBalance = 0;    // Reset balance
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol =  {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);
        if (start != -1)
            System.out.println("Start at petrol pump: " + start);
        else
            System.out.println("No solution. Tour not possible.");
    }

}
