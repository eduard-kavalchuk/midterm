package Task2.Goods;

public class DiscountItem extends Item {
    public double discountInPercents;
    public String discountReason;
    public DiscountItem(String name, double price, double discountInPercents, String discountReason) {
        super(name, price);
        this.discountInPercents = discountInPercents;
        this.discountReason = discountReason;
    }

    public double getPrice() {
        return price * discountInPercents / 100;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + price + " Скидка - " + discountInPercents + "%, Уценка - " + discountReason;
    }
}
