package com.gevernova.oops.librarysystem;

// abstract class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    //Encapsulate getters
    public String itemId(){
        return itemId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    // abstract methods
    public abstract int getLoanDuration();

    // concrete method
    public void getItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
