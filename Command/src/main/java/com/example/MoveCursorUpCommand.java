package com.example;

public class MoveCursorUpCommand implements Command {
    private CursorControl cursor;

    public MoveCursorUpCommand(CursorControl cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveUp();
    }
}
