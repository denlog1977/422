package com.example.a422;

public class Product {

    int price;
    int quantity;
    String name;
    int image;

    public Product(int price, int quantity, String name, int image) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.image = image;
    }

    public Product(int price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
