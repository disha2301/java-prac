package com.gevernova.string.levelone;
import java.util.*;
public class TrimCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        String str1 = myTrim(str);
        String str2 = str.trim();
        System.out.println("Trimmed without built-in function is "+str1);
        System.out.println("Trimmed with built-in function is "+str2);
        System.out.println("is the result same ? : "+ str1.equals(str2));
    }
    public static String myTrim(String str){
        int start = 0;
        int end = str.length()-1;
        while(start <=end && str.charAt(start) == ' '){
            start++;
        }
        while(end>=start && str.charAt(end) == ' '){
            end--;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=start;i<=end;i++){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    
}
