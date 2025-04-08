package com.gevernova.controlflow.leveltwo;
import java.util.*;

class FriendComparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int a1 = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double h1 = sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int a2 = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double h2 = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int a3 = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double h3 = sc.nextDouble();

        String youngest = "";
        String tallest = "";

        // Find youngest friend
        if (a1 < a2 && a1 < a3) youngest = "Amar";
        else if (a2 < a1 && a2 < a3) youngest = "Akbar";
        else if (a3 < a1 && a3 < a2) youngest = "Anthony";
        else youngest = "All have the same age";

        // Find tallest friend
        if (h1 > h2 && h1 > h3) tallest = "Amar";
        else if (h2 > h1 && h2 > h3) tallest = "Akbar";
        else if (h3 > h1 && h3 > h2) tallest = "Anthony";
        else tallest = "All have the same height";

        System.out.println("Youngest age result: " + youngest);
        System.out.println("Tallest height result: " + tallest);
    }
}
