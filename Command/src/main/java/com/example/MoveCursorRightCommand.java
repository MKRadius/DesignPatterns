package com.example;

public class MoveCursorRightCommand implements Command {
    private CursorControl cursor;

    public MoveCursorRightCommand(CursorControl cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveRight();
    }
}
