package com.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undoHistory; // Memento history
    private List<IMemento> redoHistory; // Redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public List<IMemento> getUndoHistory() {
        return undoHistory;
    }

    public List<IMemento> getRedoHistory() {
        return redoHistory;
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            redoHistory.add(model.createMemento()); // Save current state to redo history
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in redo history");
            IMemento nextState = redoHistory.remove(redoHistory.size() - 1);
            undoHistory.add(model.createMemento()); // Save current state to history
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    public void restoreState(IMemento memento) {
        saveToHistory();
        model.restoreState(memento);
        gui.updateGui();
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
        gui.updateHistoryWindow();
    }
}