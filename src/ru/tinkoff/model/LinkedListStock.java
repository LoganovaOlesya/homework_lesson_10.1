package ru.tinkoff.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStock extends Stock {

    private LinkedList<Item> warehouse;

    public LinkedListStock(LinkedList<Item> list) {
        warehouse = list;
    }

    @Override
    public Iterator iterator() {
        return warehouse.iterator();
    }

    @Override
    int size() {
        return warehouse.size();
    }

    @Override
    boolean isEmpty() {
        return warehouse.isEmpty();
    }

    @Override
    boolean contains(Item item) {
        return warehouse.contains(item);
    }

    @Override
    boolean add(Item item) {
        return warehouse.add(item);
    }

    @Override
    boolean remove(Item item) {
        return warehouse.remove(item);
    }

    @Override
    Item get(int index) {
        return warehouse.get(index);
    }
}
