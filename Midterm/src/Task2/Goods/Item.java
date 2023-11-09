package Task2.Goods;

/**
 * Здесь выбор абстрактного класса в пользу интерфейса для необходимости наследования полей
 * Хотя, технически можно наследоваться напрямую от RegularItem
 * */
public abstract class Item {
    public String name;
    public double price;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract String toString();
    public abstract double getPrice();
}
