package com.example;

import javafx.stage.Stage;

public class Room {
    private ChatHandler handler;

    public void open(ChatHandler handler) {
        this.handler = handler;
        handler.addClientWindow(new Client("Alice", handler), new Window(handler));
        handler.addClientWindow(new Client("Bob", handler), new Window(handler));
        handler.addClientWindow(new Client("Charlie", handler), new Window(handler));

        handler.getWindows().forEach(window -> window.start(new Stage()));
    }

    public ChatHandler getHandler() {
        return handler;
    }
}
