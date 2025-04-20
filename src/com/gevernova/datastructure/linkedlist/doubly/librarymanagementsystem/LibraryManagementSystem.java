package com.gevernova.datastructure.linkedlist.doubly.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryOperations library = new LibraryOperations();

        Book b1 = new Book(1, "Harry Potter", "J.K. Rowling", "Fantasy", true);
        Book b2 = new Book(2, "Atomic Habits", "James Clear", "Self-Help", true);
        Book b3 = new Book(3, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true);

        library.addFirst(b1);
        library.addLast(b2);
        library.addAtPosition(b3, 2);

        library.displayForward();

        library.updateAvailability(2, false);
        library.searchByTitle("The Hobbit");
        library.searchByAuthor("J.K. Rowling");

        library.countBooks();

        library.removeById(1);
        library.displayReverse();
    }
}
