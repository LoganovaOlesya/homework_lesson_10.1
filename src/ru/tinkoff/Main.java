package ru.tinkoff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import ru.tinkoff.model.ArrayListStock;
import ru.tinkoff.model.Item;
import ru.tinkoff.model.LinkedListStock;
import ru.tinkoff.model.Stock;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        Stock arrayListStock = createArrayListStock();
        System.out.println("Elements of ArrayList implementation of Stock class");
        for (Item item : arrayListStock) {
            System.out.println(item.getName());
        }

        Stock linkedListStock = createLinkedListStock();
        System.out.println("\nElements of LinkedList implementation of Stock class");
        for (Item item : linkedListStock) {
            System.out.println(item.getName());
        }
    }

    private static Stock createArrayListStock() {
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < random.nextInt(20); i++) {
            list.add(new Item(names[random.nextInt(35)]));
        }
        return new ArrayListStock(list);
    }

    private static Stock createLinkedListStock() {
        LinkedList<Item> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(35); i++) {
            list.add(new Item(names[random.nextInt(35)]));
        }
        return new LinkedListStock(list);
    }

    private static String[] names = new String[]{
        "vegetable", "study", "suburb", "mechanism", "comfort", "lonely", "aisle", "fever", "wisecrack", "broadcast",
        "wedding", "hypnothize", "feed", "polite", "debut", "brother", "fruit",
        "standard", "laborer", "shy", "weave", "mature", "lighter", "banquet", "subway", "premature", "aviation",
        "piece", "fresh", "survivor", "sweep", "install", "instrument", "credit card", "ridge"
    };
}
