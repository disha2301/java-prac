package com.gevernova.string.extrasstringhandling;
import java.util.*;
class SubstringCount{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = scanner.nextLine();
        System.out.println("Enter any substring");
        String sub = scanner.nextLine();
        int count = 0;
        for(int i = 0; i <= str.length() - sub.length(); i++){
            if(str.substring(i, i+sub.length()).equals(sub)){
                count++;
            }
        }
        System.out.println("Substring has occures "+count+" time(s)");
    }
}