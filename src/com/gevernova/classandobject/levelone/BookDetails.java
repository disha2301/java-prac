package com.gevernova.classandobject.levelone;

public class BookDetails {
    //attributes
    String title;
    String author;
    double price;

    //constructor to give initial values
    public BookDetails(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //method to display book details
    public void printDetails(){
        System.out.println("Book title is "+title+"\nAuthor is "+author+"\nPrice is "+price);
    }
    // main method to test the book class
    public static void main(String[] args){
        BookDetails obj = new BookDetails("Hello", "Disha", 250);
        obj.printDetails();
    }
}
