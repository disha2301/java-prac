/*6. Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.*/
import java.util.*;
class SubstringCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        System.out.println("Enter any substring");
        String sub = sc.nextLine();
        int count = 0;
        for(int i = 0; i <= str.length() - sub.length(); i++){
            if(str.substring(i, i+sub.length()).equals(sub)){
                count++;
            }
        }
        System.out.println("Substring has occures "+count+" time(s)");
    }
}