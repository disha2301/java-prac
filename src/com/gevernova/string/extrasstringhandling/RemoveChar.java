package com.gevernova.string.extrasstringhandling;
import java.util.*;
class RemoveChar{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = scanner.nextLine();
        System.out.print("Enter Character to remove : ");
        char ch = scanner.next().charAt(0);
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ch){
                result +=str.charAt(i);
            }
        }
        System.out.print("Modifies string :"+result);
    }
}