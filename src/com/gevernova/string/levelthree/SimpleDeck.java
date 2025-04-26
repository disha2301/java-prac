package com.gevernova.string.levelthree;
import java.util.Scanner;

public class SimpleDeck {

    public static void main(String[] args) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", 
                           "Jack", "Queen", "King", "Ace" };

        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int rand = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();

        System.out.print("Enter cards per player: ");
        int cards = scanner.nextInt();

        if (players * cards > 52) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        int d = 0;
        for (int i = 1; i <= players; i++) {
            System.out.println("Player " + i + " gets:");
            for (int j = 0; j < cards; j++) {
                System.out.println("  " + deck[d++]);
            }
            System.out.println();
        }
    }
}
