package com.gevernova.classandobject.levelone;

public class CircleAreaCalc {

    //attribute
    double radius;

    //constructor to initialize circle object
    public CircleAreaCalc(double radius){
        this.radius = radius;
    }

    //method to calculate the area of the circle
    public double calcArea(){
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }

    //method to display area and circumference
    public void printDeatils(){
        System.out.println("Radius is "+radius+"\n Area is "+calcArea()+"\n Circumference is "+calcCircumference());
    }

    public static void main(String args[]){
        CircleAreaCalc obj = new CircleAreaCalc(4.5);
        obj.printDeatils();
    }
}
