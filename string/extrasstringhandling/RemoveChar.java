/*10. Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word" */
import java.util.*;
class RemoveChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        System.out.print("Enter Character to remove : ");
        char ch = sc.next().charAt(0);
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ch){
                result +=str.charAt(i);
            }
        }
        System.out.print("Modifies string :"+result);
    }
}