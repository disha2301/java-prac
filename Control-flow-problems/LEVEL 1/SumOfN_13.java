/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result

 */
import java.util.Scanner;
class SumOfN_13 {
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
        for(int i = n;i>0;i--)
            Msum+=i;
        System.out.println("Sum using formula : "+Fsum);
        System.out.println("Sum without using formula : "+Msum);
        if(Fsum == Msum)
        System.out.println("Both Calculations are correct");
        else
        System.out.println("Something went wrong");
    }
}
    
}
