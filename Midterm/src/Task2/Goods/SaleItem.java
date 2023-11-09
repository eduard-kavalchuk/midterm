package Task2.Goods;

public class SaleItem extends Item {
    public double discountInPercents;
    public SaleItem(String name, double price, double discountInPercents) {
        super(name, price);
        this.discountInPercents = discountInPercents;
    }
    @Override
    public double getPrice() {
        return price * discountInPercents / 100;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + price + " Скидка - " + discountInPercents + "%";
    }
}
