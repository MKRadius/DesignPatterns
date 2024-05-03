package com.example;

public class MoveCursorLeftCommand implements Command {
    private CursorControl cursor;

    public MoveCursorLeftCommand(CursorControl cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveLeft();
    }
}
