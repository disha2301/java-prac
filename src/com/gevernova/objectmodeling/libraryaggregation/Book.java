package com.gevernova.objectmodeling.libraryaggregation;

import java.util.ArrayList;


class Book{
    String title;
    String author;

    // constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    void displayDetails(){
        System.out.println("Title: "+title+"\nAuthor: "+author);
    }
}