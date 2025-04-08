import java.util.Scanner;
class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int r = sc.nextInt();
		System.out.println("Area of the circle is "+(3.14 * (r*r)));
	}
}