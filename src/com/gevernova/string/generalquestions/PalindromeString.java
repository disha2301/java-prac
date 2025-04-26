package com.gevernova.string.generalquestions;
import java.util.Scanner;
class PalindromeString{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scanner.nextLine();
        boolean isPalin = isPalindrome(s);
        if(isPalin) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}