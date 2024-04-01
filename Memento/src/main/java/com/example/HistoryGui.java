package com.example;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.Scene;


public class HistoryGui extends Application {
    private ListView<IMemento> displayList;

    private Controller controller;

    public HistoryGui(Controller controller) {
        this.controller = controller;
        controller.setHistoryGui(this);
        displayList = new ListView<>();
    }

    public void start(Stage stage) {
        List<IMemento> historyList = controller.getHistoryList();
        displayList.setItems(FXCollections.observableArrayList(historyList));
        displayList.setPrefSize(300, 500);

        displayList.setOnMouseClicked(event -> {
            IMemento selectedMemento = displayList.getSelectionModel().getSelectedItem();
            controller.restoreState(selectedMemento);
        });

        Scene scene = new Scene(displayList, 300, 500);
        stage.setScene(scene);
        stage.setTitle("Memento History");
        stage.show();
    }

    public void updateGui() {
        displayList.getItems().clear();
        List<IMemento> historyList = controller.getHistoryList();
        displayList.setItems(FXCollections.observableArrayList(historyList));
    }
}
