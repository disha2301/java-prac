package com.gevernova.array.leveltwo;

import java.util.*;

class Reverse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Reversed digits: 0");
            return;
        }

        int temp = num;
        int count = 0;

        // Count number of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int arr[] = new int[count];
        temp = num;

        // Store digits in reverse order
        for (int i = 0; i < count; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        // Print reversed digits
        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
