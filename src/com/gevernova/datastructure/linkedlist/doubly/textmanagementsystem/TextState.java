package com.gevernova.datastructure.linkedlist.doubly.textmanagementsystem;

public class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
