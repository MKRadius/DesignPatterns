package com.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.controller.Controller;
import javafx.scene.layout.StackPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class GameView extends Application {
    private Controller controller = new Controller(this, "city"); // "city" or "wilderness"
    private static final int TREE_SIZE = 80;
    private final int CANVAS_WIDTH = controller.getGridWidth() * TREE_SIZE;
    private final int CANVAS_HEIGHT = controller.getGridHeight() * TREE_SIZE;
    private Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private GraphicsContext gc = canvas.getGraphicsContext2D();

    public void start(Stage stage) {
        stage.setTitle("Flyweight RPG");

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();

        drawMap();
    }

    public void drawMap() {
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        for (int i = 0; i < controller.getGridHeight(); i++) {
            for (int j = 0; j < controller.getGridWidth(); j++) {
                Image imageToDraw = controller.getTileImage(i, j);
                gc.drawImage(imageToDraw, j * TREE_SIZE, i * TREE_SIZE, TREE_SIZE, TREE_SIZE);
            }
        }
    }

    public static void launch() {
        Application.launch();
    }

}
