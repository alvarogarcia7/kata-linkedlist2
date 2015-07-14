package com.example.kata.persistentlist;

public class PersistentList {

    ListElement[] list;

    public PersistentList() {

    }

    public PersistentList(int...values) {

        list = new ListElement[values.length];
        ListElement nextElement = null;

        for (int i = values.length -1 ; i >= 0; i--) {
            list[i] = new ListElement(values[i], nextElement);
            nextElement = list[i];
        }
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return list.length;
    }

    public int get(int index) {
        return list[index].getValue();
    }
}
