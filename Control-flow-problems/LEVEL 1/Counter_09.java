/*Rewrite program 8 to do the countdown using the for-loop */
import java.util.Scanner;
class Counter_09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown starting value : ");
        int n = sc.nextInt();
        for(int i = n;i>=1;i--)
            System.out.println(i);
        System.out.println("Launching now!");
    } 
}
