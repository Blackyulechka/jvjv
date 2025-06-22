package Wildberries;

public class Jeans extends Product {
    private static int jeansSale = 15;
    public Jeans(String name, int article, int price) {
        super(name, article, price, jeansSale);
    }
}
