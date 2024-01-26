import Game.CityGame;
import Game.WildernessGame;
import Game.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game!");
        System.out.println("Please select a game to play:");
        System.out.println("1. City Game");
        System.out.println("2. Wilderness Game");

        Game game = null;
        int choice = scanner.nextInt();

        if (choice == 1) {
            game = new CityGame();
        } else if (choice == 2) {
            game = new WildernessGame();
        } else {
            System.out.println("Invalid choice!");
            System.exit(1);
        }

        game.main();

        scanner.close();
    }
}
