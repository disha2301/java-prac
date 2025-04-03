import java.util.Scanner;
class Conversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		double c = sc.nextDouble();
		System.out.println("Temperature in Fahrenheit is "+((c* 9/5)+32));
	}
}