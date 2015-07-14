package com.example.kata.persistentlist;

public class ListElement {

    private int value;

    private ListElement nextElement;

    public ListElement(int value, ListElement nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }

    public int getValue() {
        return value;
    }
}
