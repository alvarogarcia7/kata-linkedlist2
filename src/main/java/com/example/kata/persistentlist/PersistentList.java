package com.example.kata.persistentlist;

public class PersistentList {

    int[] list;

    public PersistentList() {

    }

    public PersistentList(int...values) {
        list = values;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return list.length;
    }

    public int get(int index) {
        return list[index];
    }
}
