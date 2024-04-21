package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ChatHandler  {
    private HashMap<Client, Window> clientWindow;

    public ChatHandler() {
        this.clientWindow = new HashMap<>();
    }

    public void addClientWindow(Client client, Window window) {
        clientWindow.put(client, window);
        window.setClientName(client.getUsername());
    }

    public HashMap<Client, Window> getClientWindow() {
        return clientWindow;
    }

    public List<String> getClients() {
        return clientWindow.keySet().stream().map(Client::getUsername).collect(Collectors.toList());
    }

    public List<Window> getWindows() {
        return clientWindow.values().stream().collect(Collectors.toList());
    }
    
    public void sendMessage(String sender, String message, String recipient) {
        clientWindow.get(getClientWithUserName(recipient)).displayMessage(sender, message);
    }

    public void displayMessage(String sender, String message) {
        clientWindow.forEach((client, window) -> {
            if (!client.getUsername().equals(sender)) {
                window.displayMessage(sender, message);
            }
        });
    }

    public Client getClientWithUserName(String username) {
        return clientWindow.keySet().stream().filter(client -> client.getUsername().equals(username)).findFirst().orElse(null);
    }
} 
