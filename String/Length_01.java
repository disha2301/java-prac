/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result */
import java.util.*;
class Length_01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.next();
        int len1 = lengthCalc(s);
        int len2 = s.length();
        System.out.print("Lenght calculated without inbuilt method : "+len1+"\n");
        System.out.print("Length calculated with inbuilt method : "+len2);
    }
    static int lengthCalc(String s){
        int c=0;
        try{
            while(true){
                s.charAt(c);
                c++;
            }
        }
        catch(IndexOutOfBoundsException e){
            return c;
        }
    }
}