package com.gevernova.oops.librarysystem;
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

