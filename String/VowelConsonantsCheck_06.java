/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
 */
import java.util.*;
class VowelConsonantsCheck_06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        String ans[][]=myCheck(s);
        display(ans);
    }
    //function to check if the character is Vowel, Consonant or letter
    public static String myCheckType(char ch){
        if(ch >='A' && ch<='Z')
        ch = (char)(ch+32);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return "Vowel";
        else if(ch>='a' && ch<='z')
        return "Consonant";
        return "Not a letter";
    }
    //function to store in 2D array
    public static String[][] myCheck(String str){
        int len = str.length();
        String[][] charType = new String[len][2];
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            charType[i][0]=String.valueOf(ch);
            charType[i][1]=myCheckType(ch);
        }
        return charType;
    }
    public static void display(String[][] result){
        System.out.println("\n Character \n Type");
        for(String[] row:result){
            System.out.println(row[0]+" is a "+ row[1]);
        }
    }
}
