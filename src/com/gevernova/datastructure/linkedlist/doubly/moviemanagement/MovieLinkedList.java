package com.gevernova.datastructure.linkedlist.doubly.moviemanagement;

public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // add movie at beginning
    public void addFrist(MovieNode movie){
        if(head == null){
            head = tail = movie;
        } else {
            movie.next = head;
            head.prev = movie;
            head = movie;
        }
    }
    // add movie at the end
    public void addLast(MovieNode movie){
        if(tail == null){
            head = tail = movie;
        } else {
            tail.next = movie;
            movie.prev = tail;
            tail = movie;
        }
    }

    // add movie at a specific position
    public void addAtPosition(MovieNode movie, int pos){
        if(pos <= 0){
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1){
            addFrist(movie);
            return;
        }
        MovieNode temp = head;
        for(int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            addLast(movie);
            return;
        }
        movie.next = temp.next;
        movie.prev = temp;
        temp.next.prev = movie;
        temp.next = movie;
    }

    // remove movie by title
    public void removeByTitle(String title){
        MovieNode temp = head;
        while(temp != null){
            if(temp.title.equalsIgnoreCase(title)){
                if(temp == head && temp == tail){
                    head = tail = null;
                } else if( temp == head){
                    head = head.next;
                    head.prev = null;
                } else if(temp == tail){
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }
    // search by director
    public void searchByDirector(String director){
        MovieNode temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.director.equalsIgnoreCase(director)){
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found by " + director);
    }

    // search by rating
    public void searchByRating(double rating){
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating " + rating);
    }

    // upfate rating by title
    public void updateRating(String title, double newRating){
        MovieNode temp = head;
        while(temp != null){
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // display forward
    public void displayForward() {
        MovieNode temp = head;
        System.out.println("Movies (Forward):");
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }
    // 9. Display reverse
    public void displayReverse() {
        MovieNode temp = tail;
        System.out.println("Movies (Reverse):");
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }
    // Helper to print a movie
    private void printMovie(MovieNode movie) {
        System.out.println("Title: " + movie.title + ", Director: " + movie.director +
                ", Year: " + movie.year + ", Rating: " + movie.rating);
    }
}
