package com.gevernova.constructorsandvariables.modifiers;

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("123-456789", "Java Basics", "John Smith");
        book1.printDetails();

        // Updating author name using setter
        book1.setAuthor("Alice Johnson");
        System.out.println("Updated Author: " + book1.getAuthor());

        System.out.println();

        // Creating an EBook object
        EBook ebook1 = new EBook("789-123456", "Advanced Java", "Emily Davis");
        ebook1.displayDetails();
    }
}
// base class
class Book{
    public String ISBN;
    protected String title;
    private String author;

    // constructor to initialize book obj
    Book(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // public getter for author
    public String getAuthor(){
        return author;
    }

    // public setter for author
    public void setAuthor(String author){
        this.author = author;
    }

    //Display book details
    public void printDetails(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// subclass to demonstrate access modifiers

class EBook extends Book{

    // constructor
    EBook(String ISBN, String title, String author){
        super(ISBN, title, author);
    }

    // accessing the public and protected members
    public void displayDetails(){
        System.out.println("E-Book ISBN: " + ISBN);       // public
        System.out.println("E-Book Title: " + title);     // protected
        // author is private and cannot be accessed directly
    }
}
