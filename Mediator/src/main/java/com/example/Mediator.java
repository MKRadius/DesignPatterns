package com.example;

import java.util.HashMap;
import java.util.List;

public interface Mediator {
    void addClientWindow(Client client, Window window);
    HashMap<Client, Window> getClientWindow();
    List<String> getClients();
    List<Window> getWindows();
    void sendMessage(String sender, String message, String recipient);
    void displayMessage(String sender, String message);
}
