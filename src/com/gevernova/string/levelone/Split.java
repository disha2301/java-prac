package com.gevernova.string.levelone;
import java.util.*;
class Split{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String string = scanner.nextLine();
        String stringOne[]=mySplit(string);
        String stringTwo[]=string.split(" ");
        boolean compare = isSame(stringOne,stringTwo);
        System.out.println("Words without using inbuilt method "+Arrays.toString(stringOne));
        System.out.println("Words using inbuilt method "+Arrays.toString(stringTwo));
        System.out.println("Comparision results :"+compare);
    }
    public static int findLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }
        catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[] mySplit(String s){
        int len = findLength(s);
        int wordC=1;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == ' ')
            wordC++;
        }
    String words[]=new String[wordC];
    int start=0;
    int wordIndex=0;
    for (int i = 0; i < len; i++) {
        if (s.charAt(i) == ' ') {
            words[wordIndex++] = s.substring(start, i);
            start = i + 1;
        }
    }
    words[wordIndex] = s.substring(start, len);
        return words;
}
public static boolean isSame(String[] arr1, String[] arr2) {
    return Arrays.equals(arr1, arr2);
}
}