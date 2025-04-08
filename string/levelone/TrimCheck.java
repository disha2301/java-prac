/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result */
import java.util.*;
public class TrimCheck_07 {
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
