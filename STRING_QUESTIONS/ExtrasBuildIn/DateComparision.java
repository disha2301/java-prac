/*4. Problem 4: Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate

class.*/
import java.time.LocalDate;
import java.util.Scanner;
class DateComparision{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date 1 in (yyyy-mm-dd) format : ");
        String d1 = sc.nextLine();
        System.out.print("Enter date 2 in (yyyy-mm-dd) format : ");
        String d2 = sc.nextLine();

        LocalDate ld1 = LocalDate.parse(d1);
        LocalDate ld2 = LocalDate.parse(d2);

        if(ld1.isBefore(ld2)){
            System.out.println("The first date comes before");
        }
        else if(ld1.isAfter(ld2)){
            System.out.println("The first date comes after");
        }
        else if(ld1.isEqual(ld2)){
            System.out.println("Both dates are same");
        }
    }
}