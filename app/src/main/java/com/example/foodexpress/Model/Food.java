package com.example.foodexpress.Model;

public class Food {
    private String Name;
    private double Price;
    private  String Category;

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Food() {
    }
}
