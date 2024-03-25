package com.example;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.Scene;


public class HistoryWindowGui extends Application {
    private ListView<IMemento> displayList;

    private Controller mainController;
    private HistoryWindowController historyWindowController;

    public HistoryWindowGui(Controller mainController) {
        this.mainController = mainController;
        this.historyWindowController = new HistoryWindowController(this);
    }

    public Controller getMainController() {
        return mainController;
    }

    public void start(Stage stage) {
        displayList = new ListView<>();
        List<IMemento> historyList = historyWindowController.getHistoryList();
        displayList.setItems(FXCollections.observableArrayList(historyList));
        displayList.setPrefSize(300, 500);

        displayList.setOnMouseClicked(event -> {
            IMemento selectedMemento = displayList.getSelectionModel().getSelectedItem();
            mainController.restoreState(selectedMemento);
        });

        Scene scene = new Scene(displayList, 300, 500);
        stage.setScene(scene);
        stage.setTitle("Memento History");
        stage.show();
    }

    public void updateGui() {
        displayList.getItems().clear();
        List<IMemento> historyList = historyWindowController.getHistoryList();
        displayList.setItems(FXCollections.observableArrayList(historyList));
    }
}
