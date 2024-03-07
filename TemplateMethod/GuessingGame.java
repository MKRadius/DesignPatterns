import java.util.Scanner;

public class GuessingGame extends Game {
    Scanner scanner = new Scanner(System.in);
    private boolean endOfGame = false;
    private int numberToGuess;
    private int winner;

    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("Initializing game for " + numberOfPlayers + " players.");
        System.out.println("You have to guess a number between 1 and " + (numberOfPlayers * numberOfPlayers) + ".");
        numberToGuess = (int) (Math.random() * (numberOfPlayers * numberOfPlayers) + 1);
    }

    @Override
    public boolean endOfGame() {
        return endOfGame;
    }

    @Override   
    public void playSingleTurn(int player) {
        System.out.print("Player " + (player + 1) + " guess the number is: ");
        int guess = scanner.nextInt();
        if (guess == numberToGuess) {
            endOfGame = true;
            winner = player;
        }
        else {
            System.out.println("Player " + (player + 1) + " guessed wrong.");
            System.out.println("The number to guess is " + (guess > numberToGuess ? "lower" : "higher") + ".");
        }
    }

    @Override
    public void displayWinner() {
        System.out.println("Player " + (winner + 1) + " wins!");
    }
}
