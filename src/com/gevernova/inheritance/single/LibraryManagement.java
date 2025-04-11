package com.gevernova.inheritance.single;
// Superclass representing a Book
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
// Subclass Author extends Book and adds more specific details
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo to include author details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
// main class
public class LibraryManagement {
    public static void main(String[] args) {
        // Create a book with author details
        Author authorBook = new Author(
                "The Art of Java",
                2022,
                "Disha Yadav",
                "Disha is a software engineer passionate about clean code and teaching Java, C and C++."
        );

        // Display book and author info
        System.out.println("Book Details:");
        authorBook.displayInfo();
    }
}
