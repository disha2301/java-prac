package com.gevernova.string.leveltwo;
import java.util.Scanner;

public class SimpleRPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0, computerWins = 0;

        System.out.print("How many rounds do you want to play? ");
        int rounds = scanner.nextInt();
        scanner.nextLine(); // clear newline

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter rock, paper, or scissors: ");
            String userChoice = scanner.nextLine().toLowerCase();

            String[] options = {"rock", "paper", "scissors"};
            String compChoice = options[(int)(Math.random() * 3)];

            System.out.println("Computer chose: " + compChoice);

            if (userChoice.equals(compChoice)) {
                System.out.println("It's a draw!");
            } else if (
                (userChoice.equals("rock") && compChoice.equals("scissors")) ||
                (userChoice.equals("paper") && compChoice.equals("rock")) ||
                (userChoice.equals("scissors") && compChoice.equals("paper"))
            ) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }
        }
        System.out.println("\nGame Over!");
        System.out.println("You won " + userWins + " times.");
        System.out.println("Computer won " + computerWins + " times.");
    }
}
