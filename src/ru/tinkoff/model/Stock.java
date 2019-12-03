package ru.tinkoff.model;

import java.util.List;

public abstract class Stock implements Iterable<Item> {

    abstract int size();

    abstract boolean isEmpty();

    abstract boolean contains(Item item);

    abstract boolean add(Item item);

    abstract boolean remove(Item item);

    abstract Item get(int index);
}
