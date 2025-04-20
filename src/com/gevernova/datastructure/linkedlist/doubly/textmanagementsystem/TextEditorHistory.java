package com.gevernova.datastructure.linkedlist.doubly.textmanagementsystem;

public class TextEditorHistory {
    private TextState current;
    private int historySize = 0;
    private final int MAX_HISTORY = 10;

    // Add a new state to the history
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        // Clear redo history
        if (current != null) {
            current.next = null;
            newState.prev = current;
        }

        current = newState;
        historySize++;

        // Trim to max history
        trimHistory();
    }

    // Undo: Move to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo done.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo: Move to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo done.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display the current text content
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }

    // Trim history to maintain only the last 10 states
    private void trimHistory() {
        // Go to head
        TextState temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }

        // Count how many states there are
        int count = 0;
        TextState node = temp;
        while (node != null) {
            count++;
            node = node.next;
        }

        // If more than MAX_HISTORY, remove oldest states
        while (count > MAX_HISTORY) {
            if (temp.next != null) {
                temp = temp.next;
                temp.prev = null;
            }
            count--;
        }
    }
}
