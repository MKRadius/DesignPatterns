package Map;

import java.util.Random;

import Tile.Tile;
import Tile.SwampTile;
import Tile.WaterTile;
import Tile.ForestTile;

public class WildernessMap implements Map {
    private Tile[][] map = new Tile[5][5];

    public void createTile() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int tileType = rand.nextInt(3);

                switch (tileType) {
                    case 0:
                        map[i][j] = new SwampTile();
                        break;
                    case 1:
                        map[i][j] = new WaterTile();
                        break;
                    case 2:
                        map[i][j] = new ForestTile();
                        break;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(map[i][j].getCharacter());
            }
            System.out.println();            
        }
    }
}
