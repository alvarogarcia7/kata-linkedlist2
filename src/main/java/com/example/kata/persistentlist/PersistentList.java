package com.example.kata.persistentlist;

public class PersistentList {

    int[] list;

    public PersistentList(int i) {

        list = new int[1];
        list[0]=i;
    }

    public PersistentList() {

    }

    public PersistentList(int a, int b) {
        list = new int[2];
        list[0]=a;
        list[1]=b;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return list.length;
    }
}
