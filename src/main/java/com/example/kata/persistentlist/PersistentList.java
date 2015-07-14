package com.example.kata.persistentlist;

public class PersistentList {

    ListElement lastElement;
    ListElement firstElement;
    private int size;

    public PersistentList() {

    }

    public PersistentList(int...values) {
        this(values.length - 1, null, values);
        size = values.length;
    }

    private PersistentList(int currentPosition, ListElement nextValue, int... values){

        lastElement = new ListElement(values[currentPosition], nextValue);
        final int i = currentPosition - 1;

        if (i >= 0) {
            createRecursively(i, lastElement, values);
        } else {
            firstElement = lastElement;
        }
    }

    private void createRecursively(int i, ListElement nextElement, int[] values) {
        if (i == 0) {
            firstElement = new ListElement(values[i], nextElement);
        } else {
            ListElement middleElement = new ListElement(values[i], nextElement);
            createRecursively(i - 1, middleElement, values);
        }
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return get(firstElement, index);
    }

    private int get(ListElement element, int index) {
        if(index == 0){
            return element.getValue();
        } else {
            return get(element.getNext(), index - 1);
        }
    }
}
