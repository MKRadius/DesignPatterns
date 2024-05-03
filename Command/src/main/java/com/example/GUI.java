package com.example;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;

public class GUI extends Application {
    private final String UP_KEY = "UP";
    private final String DOWN_KEY = "DOWN";
    private final String LEFT_KEY = "LEFT";
    private final String RIGHT_KEY = "RIGHT";
    private final String TOGGLE_KEY = "SPACE";

    private final int GRID_SIZE = 8;
    private Rectangle[][] pixels = new Rectangle[GRID_SIZE][GRID_SIZE];
    private int cursorX = 0;
    private int cursorY = 0;

    public void toggleBorder() {
        if (pixels[cursorX][cursorY].getStrokeWidth() == 5) {
            pixels[cursorX][cursorY].setStrokeWidth(0);
            pixels[cursorX][cursorY].setWidth(75);
            pixels[cursorX][cursorY].setHeight(75);
        } else {
            pixels[cursorX][cursorY].setStrokeWidth(5);
            pixels[cursorX][cursorY].setWidth(70);
            pixels[cursorX][cursorY].setHeight(70);
        }
    }

    public void moveCursorUp() {
        if (cursorY > 0) {
            toggleBorder();
            cursorY--;
            toggleBorder();
        }
    }

    public void moveCursorDown() {
        if (cursorY < GRID_SIZE - 1) {
            toggleBorder();
            cursorY++;
            toggleBorder();
        }
    }

    public void moveCursorLeft() {
        if (cursorX > 0) {
            toggleBorder();
            cursorX--;
            toggleBorder();
        }
    }

    public void moveCursorRight() {
        if (cursorX < GRID_SIZE - 1) {
            toggleBorder();
            cursorX++;
            toggleBorder();
        }
    }

    public void togglePixel() {
        if (pixels[cursorX][cursorY].getFill() == Color.RED) {
            pixels[cursorX][cursorY].setFill(Color.GREEN);
        } else {
            pixels[cursorX][cursorY].setFill(Color.RED);
        }
    }

    public void generateCode() {
        StringBuilder codeBuilder = new StringBuilder("int[][] pixelArt = {\n");
        for (int y = 0; y < GRID_SIZE; y++) {
            codeBuilder.append("    {");
            for (int x = 0; x < GRID_SIZE; x++) {
                codeBuilder.append(pixels[x][y].getFill() == Color.RED ? "0" : "1");
                if (x < GRID_SIZE - 1) {
                    codeBuilder.append(", ");
                }
            }
            codeBuilder.append("}");
            if (y < GRID_SIZE - 1) {
                codeBuilder.append(",");
            }
            codeBuilder.append("\n");
        }
        codeBuilder.append("};");
        System.out.println(codeBuilder.toString());
    }

    @Override
    public void start(Stage stage) {
        CursorControl cursorControl = new CursorControl(this);
        PixelControl pixelControl = new PixelControl(this);
        ConsoleControl consoleControl = new ConsoleControl(this);

        Command moveCursorUp = new MoveCursorUpCommand(cursorControl);
        Command moveCursorDown = new MoveCursorDownCommand(cursorControl);
        Command moveCursorRight = new MoveCursorRightCommand(cursorControl);
        Command moveCursorLeft = new MoveCursorLeftCommand(cursorControl);
        Command togglePixel = new TogglePixelCommand(pixelControl);
        Command generateCodeConsole = new GenerateCodeCommand(consoleControl);

        PixelWindowControl pwControl = new PixelWindowControl(
            moveCursorUp, 
            moveCursorDown, 
            moveCursorLeft, 
            moveCursorRight, 
            togglePixel, 
            generateCodeConsole
        );

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                pixels[i][j] = new Rectangle(75, 75, Color.RED);
                pixels[i][j].setStroke(Color.BLACK);
                pixels[i][j].setStrokeWidth(0);
                gridPane.add(pixels[i][j], i, j);
            }
        }

        pixels[cursorX][cursorY].setWidth(70);
        pixels[cursorX][cursorY].setHeight(70);
        pixels[cursorX][cursorY].setStrokeWidth(5);

        Button btnCreateCode = new Button("Create Code");
        btnCreateCode.setOnAction(e -> pwControl.generateCode());

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(gridPane, btnCreateCode);

        Scene scene = new Scene(vBox, 650, 670);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                KeyEvent keyEvent = (KeyEvent) event;
                switch (keyEvent.getCode().toString()) {
                    case UP_KEY:
                        pwControl.moveCursorUp();
                        break;
                    case DOWN_KEY:
                        pwControl.moveCursorDown();
                        break;
                    case RIGHT_KEY:
                        pwControl.moveCursorRight();
                        break;
                    case LEFT_KEY:
                        pwControl.moveCursorLeft();
                        break;
                    case TOGGLE_KEY:
                        pwControl.togglePixel();
                        break;
                    default:
                        break;
                }
                event.consume();
            }
        });
        
        stage.setScene(scene);
        stage.setTitle("Pixel Art");
        stage.setResizable(false);
        stage.show();
        gridPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
