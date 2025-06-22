package Wildberries;

public abstract class Product {
    private String name;
    private int article;
    private int price;
    private int productSale;

    public Product(String name, int article, int price, int productSale) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.productSale = productSale;
    }

    public String getName() {
        return name;
    }

    public int getArticle() {
        return article;
    }

    public int getPrice() {
        return price;
    }

    public int getProductSale() {
        return productSale;
    }

    @Override
    public String toString() {
        return name + ": " + article + " - " + price + " руб.";
    }
}
