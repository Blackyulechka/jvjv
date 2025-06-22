package Wildberries;

public class WildberriesSystemMain {
    public static void main(String[] args) {
        User user = new User(12345, 10);
        Basket<Product> basket = new Basket<>();
        Product jeans = new Jeans("Джинсы", 12345, 5000, 5);
        Product cream = new Cream("Крем", 54321, 1000, 0);

        basket.addProduct(jeans, 2);
        basket.addProduct(cream, 1);
        LocalSalesSystem system = new LocalSalesSystem();
        system.printBasket(user, basket);
    }
}