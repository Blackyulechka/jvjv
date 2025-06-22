package Wildberries;

public class Cream extends Product {
    private static int creamSale = 5;
    public Cream(String name, int article, int price) {
        super(name, article, price, creamSale);
    }
}
