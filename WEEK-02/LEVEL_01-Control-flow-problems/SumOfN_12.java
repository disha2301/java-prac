/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
 */
import java.util.Scanner;
class SumOfN_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println(+n+" is not a natural number");
        }
        else{
        int Fsum = n*(n+1)/2;
        int Msum=0;
        int temp = n;
        while(temp>0){
            Msum+=temp;
            temp--;
        }
        System.out.println("Sum using formula : "+Fsum);
        System.out.println("Sum without using formula : "+Msum);
        if(Fsum == Msum)
        System.out.println("Both Calculations are correct");
        else
        System.out.println("Something went wrong");
    }
}
    
}
