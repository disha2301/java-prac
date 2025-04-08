/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
 */
import java.util.*;
class YoungestnHeight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amars's age : \n");
        int a1 = sc.nextInt();
        System.out.print("Enter Amars's height : \n");
        double h1 = sc.nextDouble();
        System.out.print("Enter Akbar's age : \n");
        int a2 = sc.nextInt();
        System.out.print("Enter Akbar's height : \n");
        double h2 = sc.nextDouble();
        System.out.print("Enter Anthony's age : \n");
        int a3 = sc.nextInt();
        System.out.print("Enter Anthony's height : \n");
        double h3 = sc.nextDouble();
        String ans1="";
        String ans2="";
        if(a1 < a2 && a1 < a3) ans1="Amar";
        else if (a2< a1 && a2<a3) ans1="Akbar";
        else if(a3<a1 && a3<a2) ans1="Anthony";
        else ans1 ="all have same age";
        System.out.println("Youngest age result : "+ans1);

        if(h1 > h2 && h1 > h3) ans2="Amar";
        else if (h2> h1 && h2>h3) ans2="Akbar";
        else if(h3>h1 && h3>h2) ans2="Anthony";
        else ans2 ="all have same height";
        System.out.println("Tallest height result : "+ans2);
    }
 }