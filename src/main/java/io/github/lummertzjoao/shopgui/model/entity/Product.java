package io.github.lummertzjoao.shopgui.model.entity;

public class Product extends MenuItem {

    private String name;
    private double price;

    public Product(String name, double price, MenuItem menuItem) {
        super(menuItem.getSlot(), menuItem.getIcon(), menuItem.getLore());
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
