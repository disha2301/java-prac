/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result */
import java.util.*;
class Split_02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String s = sc.nextLine();
        String s1[]=mySplit(s);
        String s2[]=s.split(" ");
        boolean compare = isSame(s1,s2);
        System.out.println("Words without using inbuilt method "+Arrays.toString(s1));
        System.out.println("Words using inbuilt method "+Arrays.toString(s2));
        System.out.println("Comparision results :"+compare);
    }
    public static int findLength(String s){
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