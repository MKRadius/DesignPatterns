package com.example;

public class MoveCursorDownCommand implements Command {
    private CursorControl cursor;

    public MoveCursorDownCommand(CursorControl cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveDown();
    }
}
