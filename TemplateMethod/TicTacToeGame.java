import java.util.Scanner;

public class TicTacToeGame extends Game {
    Scanner scanner = new Scanner(System.in);
    private boolean endOfGame = false;
    private int winner;
    private String[][] board = new String[3][3];

    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("Initializing game for 2 players.");
        System.out.println("You are playing tic-tac-toe.");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    @Override
    public boolean endOfGame() {
        return endOfGame;
    }

    @Override   
    public void playSingleTurn(int player) {
        displayBoard();
        System.out.println("Enter the row and column where you want to place your mark.");

        int row;
        int col;

        System.out.print("Row: "); row = scanner.nextInt();
        System.out.print("Column: "); col = scanner.nextInt();

        if (board[row][col].equals(" ")) {
            if (player == 0) {
                board[row][col] = "X";
            } else {
                board[row][col] = "O";
            }
        }
        else {
            System.out.println("That position is already taken.");
            playSingleTurn(player);
        }

        if (checkWinner()) {
            endOfGame = true;
            winner = player;
        }
        
    }

    @Override
    public void displayWinner() {
        displayBoard();
        System.out.println("Player " + (winner + 1) + " wins!");
    }

    public void displayBoard() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
        System.out.println("     0     1     2");
        System.out.println("   _____ _____ _____");
        for (int i = 0; i < 3; i++) {
            System.out.println("  |     |     |     |");
            System.out.println(i + " |  " + board[i][0] + "  |  " + board[i][1] + "  |  " + board[i][2] + "  |");
            System.out.println("  |_____|_____|_____|");
        }
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals(" ")) {
                return true;
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals(" ")) {
                return true;
            }
        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")) {
            return true;
        }
        return false;
    }
}
