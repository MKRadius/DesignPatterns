package Map;

import java.util.Random;

import Tile.Tile;
import Tile.RoadTile;
import Tile.ForestTile;
import Tile.BuildingTile;

public class CityMap implements Map {
    private Tile[][] map = new Tile[5][5];

    public void createTile() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int tileType = rand.nextInt(3);

                switch (tileType) {
                    case 0:
                        map[i][j] = new RoadTile();
                        break;
                    case 1:
                        map[i][j] = new ForestTile();
                        break;
                    case 2:
                        map[i][j] = new BuildingTile();
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
