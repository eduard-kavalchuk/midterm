package Task2;

import Task2.Goods.DiscountItem;
import Task2.Goods.Item;
import Task2.Goods.RegularItem;
import Task2.Goods.SaleItem;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store();
        Item regularItem = new RegularItem("RegularItem1", 1.23);
        Item saleItem = new SaleItem("SaleItem1", 2.34, 25);
        Item discountItem = new DiscountItem(
                "DiscountItem1",
                3.45,
                30,
                "Гнилые бананы"
        );

        store.addItem(regularItem);
        store.addItem(saleItem);
        store.addItem(discountItem);

        System.out.println("Список товаров в магазине:");
        for (Item item : store.getItems())
            System.out.println(item.toString());

        Basket basket = store.getBasket();
        basket.addItem(regularItem, 2);
        basket.addItem(saleItem, 3);
        basket.addItem(discountItem, 4);

        System.out.println("\nСписок товаров в корзине:");
        for (SelectedItem item : basket.getItems())
            System.out.println(item.item.toString() + ", Кол-во - " + item.quantity);

        Check check = store.getCheck(basket);
        System.out.println("\nЧек:");
        System.out.println(check.toString());

        // Сумма в чеке правильная!
    }
}
