package com.gevernova.datastructure.linkedlist.doubly.moviemanagement;

public class MovieNode {
    String title;
    String director;
    int year;
    double rating;

    MovieNode prev;
    MovieNode next;

    // constructor
    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
