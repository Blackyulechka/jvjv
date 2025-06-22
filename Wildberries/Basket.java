package Wildberries;

import java.util.HashMap;
import java.util.Map;

public class Basket<T extends Product> {
    private Map<T, Integer> items = new HashMap<>();

    public void addProduct(T product, int count) {
        if (items.containsKey(product)) {
            int productCount = items.get(product);
            items.put(product, count + productCount);
        } else {
            items.put(product, count);
        }
    }

    public Map<T, Integer> getItems() {
        return new HashMap<>(items);
    }

    public double CalculateBasketSum(User user) {
        double totalSum = 0;
        for (Map.Entry<T, Integer> item : items.entrySet()) {
            T product = item.getKey();
            int count = item.getValue();
            int price = product.getPrice();
            int userSale = user.getSale();
            int productSale = product.getProductSale();
            int totalSale = userSale + productSale;

            double totalPrice = (double) (price * (100 - totalSale)) / 100;
            totalSum += totalPrice * count;
        }
        return totalSum;
    }

}
