package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ChatHandler chatHandler = new ChatHandler();
        Room room = new Room();

        room.open(chatHandler);
    }

    public static void main(String[] args) {
        launch();
    }
}