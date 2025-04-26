package com.gevernova.string.leveltwo;
import java.util.Scanner;
public class EasyTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += text.charAt(i);
        }
        String builtInTrim = text.trim();
        System.out.println("\nCustom Trimmed : '" + trimmed + "'");
        System.out.println("Built-in Trim  : '" + builtInTrim + "'");
        System.out.println("Are they same? : " + trimmed.equals(builtInTrim));
    }
}
