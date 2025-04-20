package com.gevernova.datastructure.linkedlist.doubly.moviemanagement;

public class MovieManagementSystem {
    public static void main(String[] args){
        MovieLinkedList movies = new MovieLinkedList();

        // Add movies
        movies.addLast(new MovieNode("Inception", "Christopher Nolan", 2010, 8.8));
        movies.addLast(new MovieNode("Interstellar", "Christopher Nolan", 2014, 8.6));
        movies.addFrist(new MovieNode("The Godfather", "Francis Ford Coppola", 1972, 9.2));
        movies.addAtPosition(new MovieNode("The Matrix", "Wachowski Sisters", 1999, 8.7), 2);

        // Display forward
        movies.displayForward();

        // Display reverse
        movies.displayReverse();

        // Search
        System.out.println("\nSearching by Director: Christopher Nolan");
        movies.searchByDirector("Christopher Nolan");

        System.out.println("\nSearching by Rating: 8.7");
        movies.searchByRating(8.7);

        // Update rating
        System.out.println("\nUpdating rating of 'The Matrix' to 9.0");
        movies.updateRating("The Matrix", 9.0);

        // Remove movie
        System.out.println("\nRemoving 'The Godfather'");
        movies.removeByTitle("The Godfather");

        // Final list
        System.out.println("\nUpdated Movie List (Forward):");
        movies.displayForward();
    }
}
