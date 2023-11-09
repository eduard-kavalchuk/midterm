package Task2.Goods;

public class RegularItem extends Item {
    public RegularItem(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return name + ", Цена - " + price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
