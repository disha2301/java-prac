package com.gevernova.objectmodeling.libraryaggregation;

public class LibraryAggregation{
    public static void main(String args[]){

        // book creation
        Book b1 = new Book("abc","xyz");
        Book b2 = new Book("qwe","rty");
        Book b3 = new Book("uio","poi");

        // library creation
        Library lib1 = new Library("school library");
        Library lib2 = new Library("City Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book used in another library
        lib2.addBook(b3);

        // Show books in each library
        lib1.showBooks();
        lib2.showBooks();
    }
}