package com.example;

public class Client {
    public String username;
    public ChatHandler handler;

    public Client(String username, ChatHandler handler) {
        this.username = username;
        this.handler = handler;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String sender, String message, String recipient) {
        handler.sendMessage(sender, message, recipient);
    }

    public void displayMessage(String sender, String message) {
        handler.displayMessage(sender, message);
    }
}
