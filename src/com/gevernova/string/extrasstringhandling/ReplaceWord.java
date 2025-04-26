
package com.gevernova.string.extrasstringhandling;
import java.util.*;
class ReplaceWord{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String str = scanner.nextLine();
        System.out.print("Enter word to be replaced : ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter new word to be replaced with : ");
        String newWord = scanner.nextLine();
        String result = replaceWord(str, oldWord, newWord);
        System.out.println("Modified Sentence: " + result);
    }
    public static String replaceWord(String str, String oldWord, String newWord) {
        String result="";
        String word="";
        str+=" ";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word+=ch;
            }
            else{
                if(word.equals(oldWord)){
                    result += newWord + " ";
                }
                else{
                    result+=word + " ";
                }
                word = "";
            }
        }
        return result.trim();
}
}