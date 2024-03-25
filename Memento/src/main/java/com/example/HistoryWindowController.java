package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoryWindowController {
    private HistoryWindowGui historyWindowGui;

    public HistoryWindowController(HistoryWindowGui historyWindowGui) {
        this.historyWindowGui = historyWindowGui;
    }

    public List<IMemento> getHistoryList() {
        List<IMemento> historyList = new ArrayList<>();
        historyList.addAll(historyWindowGui.getMainController().getRedoHistory());

        List<IMemento> undoHistory = new ArrayList<>(historyWindowGui.getMainController().getUndoHistory());
        Collections.reverse(undoHistory);
        historyList.addAll(undoHistory);

        return historyList;
    }
}
