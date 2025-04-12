package com.gevernova.oops.librarysystem;

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