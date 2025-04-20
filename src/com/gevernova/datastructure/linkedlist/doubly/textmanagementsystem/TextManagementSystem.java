package com.gevernova.datastructure.linkedlist.doubly.textmanagementsystem;

public class TextManagementSystem {
    public static void main(String[] args) {
        TextEditorHistory editor = new TextEditorHistory();

        // Simulating typing or commands
        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");
        editor.displayCurrentState(); // → Hello, World!

        // Undo operations
        editor.undo();
        editor.displayCurrentState(); // → Hello, World

        editor.undo();
        editor.displayCurrentState(); // → Hello

        // Redo operations
        editor.redo();
        editor.displayCurrentState(); // → Hello, World

        // New action after undo (clears redo history)
        editor.addState("Hello again");
        editor.displayCurrentState(); // → Hello again

        // Trying more undos than history
        editor.undo();
        editor.undo();
        editor.undo(); // should say no more undo
        editor.displayCurrentState();

        // Add 10+ states to test trimming
        for (int i = 1; i <= 12; i++) {
            editor.addState("Edit version " + i);
        }

        editor.displayCurrentState(); // → Edit version 12
    }
}
