/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
 */
import java.util.Scanner;

public class SimpleRPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, computerWins = 0;

        System.out.print("How many rounds do you want to play? ");
        int rounds = sc.nextInt();
        sc.nextLine(); // clear newline

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter rock, paper, or scissors: ");
            String userChoice = sc.nextLine().toLowerCase();

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
