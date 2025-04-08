//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
import java.util.*;
class LeapYear2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year after 1582");
        int yr = sc.nextInt();
        if (yr < 1582) System.out.println("Invalid input!");
        else{
            if ((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0)) {
                System.out.println(yr + " is a Leap Year");
            } else {
                System.out.println(yr + " is NOT a Leap Year");
            }
        }
    }     
}