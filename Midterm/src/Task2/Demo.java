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
                "DiscountItem",
                3.45,
                30,
                "Гнилые бананы"
        );
        
        store.addItem(regularItem);


        for (Item item : store.getItems())
            System.out.println(item.toString());

    }
}
