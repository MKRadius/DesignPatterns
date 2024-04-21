package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Window extends Application {
    private ChatHandler handler;
    private String sender;

    private BorderPane borderPane;
    private TextArea chatArea;
    private TextField messageField;
    private ComboBox<String> recipientField;
    private Button sendButton;

    public Window(ChatHandler handler) {
        this.handler = handler;
    }

    public void setClientName(String sender) {
        this.sender = sender;
    }

    public void displayMessage(String sender, String message) {
        chatArea.appendText("[" + sender + "]: " + message + "\n");
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle(sender + "'s chat window");

        borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        chatArea = new TextArea();
        chatArea.setEditable(false);
        borderPane.setCenter(chatArea);

        messageField = new TextField();
        messageField.setPromptText("Type your message...");
        messageField.setPrefWidth(300);

        recipientField = new ComboBox<>();
        recipientField.setPromptText("Select recipient...");
        handler.getClients().stream().filter(client -> !client.equals(sender)).forEach(recipientField.getItems()::add);

        sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String recipient = recipientField.getValue();
            String message = messageField.getText();
            handler.sendMessage(sender, message, recipient);
            chatArea.appendText("[You -> " + recipient + "]: " + message + "\n");
            messageField.clear();
        });

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(messageField, recipientField, sendButton);
        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane, 515, 300);
        stage.setScene(scene);
        stage.show();
    }
}