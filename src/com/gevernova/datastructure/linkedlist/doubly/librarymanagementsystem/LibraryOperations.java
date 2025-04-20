package com.gevernova.datastructure.linkedlist.doubly.librarymanagementsystem;

public class LibraryOperations {
    private Book head = null;
    private Book tail = null;

    // Add at beginning
    public void addFirst(Book newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        System.out.println("Book added at the beginning.");
    }

    // Add at end
    public void addLast(Book newBook) {
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        System.out.println("Book added at the end.");
    }

    // Add at position (1-based index)
    public void addAtPosition(Book newBook, int position) {
        if (position <= 1 || head == null) {
            addFirst(newBook);
            return;
        }

        Book temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }

        if (temp.next == null) {
            addLast(newBook);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            temp.next.prev = newBook;
            temp.next = newBook;
            System.out.println("Book added at position " + position);
        }
    }

    // Remove by Book ID
    public void removeById(int id) {
        Book temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found!");
            return;
        }

        if (temp == head) {
            head = temp.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book with ID " + id + " removed.");
    }

    // Search by title
    public void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No book found with title \"" + title + "\"");
    }

    // Search by author
    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No books found by author \"" + author + "\"");
    }

    // Update availability status
    public void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    public void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books in library: " + count);
    }

    // Helper to print a book
    private void printBook(Book book) {
        System.out.println("ID: " + book.bookId + ", Title: " + book.title +
                ", Author: " + book.author + ", Genre: " + book.genre +
                ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}
