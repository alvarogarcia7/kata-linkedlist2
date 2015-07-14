package com.example.kata.persistentlist;

import java.util.Arrays;

public class PersistentList {

    ListElement value;
    private int size;

    public PersistentList() {

    }

    public PersistentList(int...values) {
        this(values.length, values);
    }

    private PersistentList(int currentPosition, int... values){
        if(currentPosition == 0){
            value = null;
        } else {
            value = new ListElement(values[currentPosition- 1], new PersistentList(currentPosition - 1, values).value);
            size = values.length;
        }
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if(index == 0){
            return value.getValue();
        } else {
            ListElement current = value;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getValue();
        }
    }
}
