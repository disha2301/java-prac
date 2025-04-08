import java.util.Scanner;


class CircleAreaCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        // Calculate the area using Math.PI for precision
        double area = Math.PI * r * r;

        // Display the result
        System.out.println("Area of the circle is " + area + " square units");
    }
}
