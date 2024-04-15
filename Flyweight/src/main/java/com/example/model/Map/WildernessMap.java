package com.example.model.Map;

import java.util.Random;

import javafx.scene.image.Image;
import com.example.controller.TileGraphicFactory;
import com.example.model.Tile.*;

public class WildernessMap implements Map {
    private final int width = 5;
    private final int height = 5;
    private Tile[][] map = new Tile[width][height];

    public WildernessMap() {
        createTile();
    }

    public void createTile() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int tileType = rand.nextInt(3);

                switch (tileType) {
                    case 0:
                        map[i][j] = new Tile(TileGraphicFactory.getTileImage(TileType.SWAMP));
                        break;
                    case 1:
                        map[i][j] = new Tile(TileGraphicFactory.getTileImage(TileType.WATER));
                        break;
                    case 2:
                        map[i][j] = new Tile(TileGraphicFactory.getTileImage(TileType.ROAD));
                        break;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(map[i][j].getClass().getName());
            }
            System.out.println();            
        }
    }
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Image getTileImage(int x, int y) {
        return map[x][y].getTileImage().getImage();
    }
}
