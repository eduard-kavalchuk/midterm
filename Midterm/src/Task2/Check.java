package Task2;

public class Check {
    public String[] purchases;
    public double total;
    public Check(String[] purchases, double total) {
        this.purchases = purchases;
        this.total = total;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < purchases.length; i++) {
            s.append((i + 1) + ". " + purchases[i]);
        }
        s.append("Итого надо заплатить: " + total);
        return s.toString();
    }
}
