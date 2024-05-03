package com.example;

public class GenerateCodeCommand implements Command {
    private ConsoleControl console;

    public GenerateCodeCommand(ConsoleControl console) {
        this.console = console;
    }
    
    @Override
    public void execute() {
        console.generateCode();
    }
}
