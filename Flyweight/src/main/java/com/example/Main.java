package com.example;

import com.example.view.GameView;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        GameView gameView = new GameView();
        gameView.start(stage);
    }

    public static void main(String[] args) {
        GameView.launch();
    }
}
