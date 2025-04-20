package com.gevernova.datastructure.linkedlist.doubly.librarymanagementsystem;

public class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;

    Book prev;
    Book next;

    // constructor
    public Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
