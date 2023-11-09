package Task2;

import Task2.Goods.Item;

import java.util.Arrays;

public class Basket {
    private SelectedItem[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public Basket() {
        this.items = new SelectedItem[DEFAULT_CAPACITY];
    }
    public void addItem(Item item, int quantity) {
        if (size == items.length) {
            items = grow();
        }
        items[size] = new SelectedItem(item, quantity);
        ++size;
    }
    public SelectedItem[] getItems() {
        return Arrays.copyOf(items, items.length);  // shallow copy!
    }

    private SelectedItem[] grow() {
        return Arrays.copyOf(items, items.length * 2);
    }

}
