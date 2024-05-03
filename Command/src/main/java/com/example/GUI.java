package com.example;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;

public class GUI extends Application {
    private Rectangle[][] rect;
    private int[][] state;

    public GUI() {
        rect = new Rectangle[8][8];
        state = new int[8][8];
    }

    @Override
    public void start(Stage primaryStage) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                rect[i][j] = new Rectangle(100, 100, Color.RED);
                state[i][j] = 0;
            }
        }

        GridPane gridPane = new GridPane();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gridPane.add(rect[i][j], i, j);
            }
        }

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Scene scene = new Scene(gridPane, 870, 870);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
