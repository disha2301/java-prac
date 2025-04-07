/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
 */
import java.util.*;
class VowelConsonants_05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        int count[] = myCount(s);
        System.out.println("The given string has "+count[0]+" vowels");
        System.out.println("The given string has "+count[1]+" consonants");
    }
    public static String checkCase(char ch){
        //to convert from uppercase to lower case
        if(ch>='A' && ch<='Z'){
            ch = (char)(ch+32);
        }
        //check for vowels
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o'|| ch == 'u'){
            return "Vowel";
        }
        //check for consonants
        else if(ch>= 'a' && ch<='z'){
            return "Consonant";
        }
        return "Not a letter";
    }
    public static int[] myCount(String str){
        int v=0;
        int c=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            String type = checkCase(ch);
            if(type.equals("Vowel")) v++;
            else if(type.equals("Consonant")) c++;
        }
        return new int[]{v,c};
    }
}