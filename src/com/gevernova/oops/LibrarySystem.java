package com.gevernova.oops;

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

// interface for reservable items
interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable{
    private boolean isAvailable = true;
    private String borrower;

    // constructor

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName){
        if(isAvailable){
            borrower = borrowerName;
            isAvailable = false;
            System.out.println("Book reserved by " + borrowerName);
        }else {
            System.out.println("Book is currently unavailable.");
        }
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
}

// Magazine class
class Magazine extends LibraryItem{
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }
}
// DVD Class
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            borrower = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
// Main class to demonstrate polymorphism
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B001", "The Alchemist", "Paulo Coelho"),
                new Magazine("M001", "National Geographic", "Editorial"),
                new DVD("D001", "Interstellar", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Disha");
                System.out.println("Available after reservation: " + r.checkAvailability());
            }

            System.out.println("-----------------------------");
        }
    }
}