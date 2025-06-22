package Wildberries;

import java.util.Map;

public class LocalSalesSystem {
    public void printBasket(User user, Basket<Product> basket) {
        System.out.println("Корзина пользователя ID: " + user.getId());
        System.out.println("Персональная скидка: " + user.getSale() + "%");
        System.out.println("Товары:");

        for (Map.Entry<Product, Integer> item : basket.getItems().entrySet()) {
            Product product = item.getKey();
            int count = item.getValue();
            System.out.println(product + " " + count + "шт.");
        }

        System.out.println("Итоговая сумма со скидками: " + basket.CalculateBasketSum(user) + " руб.");
    }
}