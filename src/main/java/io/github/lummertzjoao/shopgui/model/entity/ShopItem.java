package io.github.lummertzjoao.shopgui.model.entity;

import org.bukkit.Material;

import java.util.List;

public class ShopItem {

    private String name;
    private double price;

    private List<String> lore;
    private Material icon;
    private int menuSlot;

    public ShopItem() {
    }

    public ShopItem(String name, double price, List<String> lore, Material icon, int menuSlot) {
        this.name = name;
        this.price = price;
        this.lore = lore;
        this.icon = icon;
        this.menuSlot = menuSlot;
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

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    public Material getIcon() {
        return icon;
    }

    public void setIcon(Material icon) {
        this.icon = icon;
    }

    public int getMenuSlot() {
        return menuSlot;
    }

    public void setMenuSlot(int menuSlot) {
        this.menuSlot = menuSlot;
    }
}
