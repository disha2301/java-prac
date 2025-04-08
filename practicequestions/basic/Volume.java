import java.util.Scanner;
import java.io.*;
class Volume{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double r = sc.nextDouble();
		System.out.println("Enter height");
		double h = sc.nextDouble();
		double volume = Math.PI * r * r * h;
        System.out.printf("Volume of the cylinder is %.2f%n", volume);
	}
}