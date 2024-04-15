package com.example.controller;

import javafx.scene.image.Image;

import com.example.model.Game.*;
import com.example.model.Map.*;
import com.example.view.GameView;

public class Controller {
    private String choice;
    private Game game;
    private Map map;
    private GameView gameView;

    public Controller(GameView gameView, String choice) {
        this.gameView = gameView;
        this.choice = choice;

        if (choice.equals("city")) {
            game = new CityGame();
        } else if (choice.equals("wilderness")) {
            game = new WildernessGame();
        }
        else {
            throw new IllegalArgumentException("Invalid choice");
        }

        map = game.createMap();
    }

    public Image getTileImage(int x, int y) {
        return map.getTileImage(x, y);
    }

    public int getGridWidth() {
        return map.getWidth();
    }

    public int getGridHeight() {
        return map.getHeight();
    }
}
