package Task2;

import Task2.Goods.Item;

import java.util.Arrays;

public class Store {
    private Item[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public Store() {
        this.items = new Item[DEFAULT_CAPACITY];
    }
    public Basket getBasket() {
        return new Basket();
    }
    public Item[] getItems() {
        return Arrays.copyOf(items, size);  // shallow copy!
    }
    public void addItem(Item item) {
        if (size == items.length) {
            items = grow();
        }
        items[size] = item;
        ++size;
    }
    private Item[] grow() {
        return Arrays.copyOf(items, items.length * 2);
    }

    public Check getCheck(Basket basket) {
        double total = 0;
        String name;
        double itemTotal;
        String record;
        String[] purchases = new String[basket.getItems().length];
        int itemNumber = 0;

        for (SelectedItem selectedItem : basket.getItems()) {
            name = selectedItem.item.toString();
            itemTotal = selectedItem.item.getPrice() * selectedItem.quantity;
            record = name + ", Количество - " + selectedItem.quantity + ", Сумма - " + itemTotal;
            purchases[itemNumber++] = record;
            total += itemTotal;
        }
        return new Check(purchases, total);
    }
}
