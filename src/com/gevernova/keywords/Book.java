package com.gevernova.keywords;

class Book {
    // static variable shared across all books
    static String libraryName = "SRM University";

    // final variable to ensure ISBN cant be changed once assigned
    final String isbn;

    // instance variables
    String title;
    String author;

    // constructor using this keyword
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
// Main class to test Book class functionality
class LibrarySystem {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Display library name using static method
        Book.displayLibraryName();
        System.out.println();

        // Check if object is instance of Book and display details
        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        System.out.println();

        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}
