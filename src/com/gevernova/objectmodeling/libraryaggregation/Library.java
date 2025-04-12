package com.gevernova.objectmodeling.libraryaggregation;
import java.util.ArrayList;

class Library{
    String name;
    ArrayList<Book> books = new ArrayList<>();
    // constructor
    Library(String name){
        this.name = name;
    }
    void addBook(Book book){
        books.add(book); // aggregation
    }
    void showBooks(){
        System.out.println("\nBooks in "+name+" :");
        for(Book b: books){
            b.displayDetails();
        }
    }
}