/*2. Problem 2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.*/
import java.time.LocalDate;
import java.util.Scanner;
class DateMath{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in (yyyy-mm-dd) format");
        String date = sc.nextLine();
        LocalDate ld = LocalDate.parse(date); // convert to local date
        LocalDate add = ld.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years we get : "+add);
        LocalDate result = add.minusWeeks(3);
        System.out.println("After removing 3 weeks we get : "+result);
    }
}