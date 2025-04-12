package com.gevernova.oops.librarysystem;
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


