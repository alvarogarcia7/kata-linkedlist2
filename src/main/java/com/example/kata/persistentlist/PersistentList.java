package com.example.kata.persistentlist;

import java.util.Arrays;

public class PersistentList {

    ListElement value;
    private int size;

    public PersistentList() {

    }

    public PersistentList(int...values) {
        this(0, values);
    }

    private PersistentList(int currentPosition, int... values){
        if(values.length == 0){
            value = null;
        } else {
            value = new ListElement(values[values.length - 1], new PersistentList(Arrays.copyOfRange(values, 0, values.length - 1)).value);
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
