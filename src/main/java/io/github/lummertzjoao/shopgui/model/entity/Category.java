package io.github.lummertzjoao.shopgui.model.entity;

import org.bukkit.Material;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Category {

    private String name;

    private List<String> lore;
    private Material menuIcon;
    private int menuSlot;

    private final Set<ShopItem> shopItems = new HashSet<>();
    private final Set<Subcategory> subcategories = new HashSet<>();

    public Category() {
    }

    public Category(String name, List<String> lore, Material menuIcon, int menuSlot) {
        this.name = name;
        this.lore = lore;
        this.menuIcon = menuIcon;
        this.menuSlot = menuSlot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    public Material getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(Material menuIcon) {
        this.menuIcon = menuIcon;
    }

    public int getMenuSlot() {
        return menuSlot;
    }

    public void setMenuSlot(int menuSlot) {
        this.menuSlot = menuSlot;
    }

    public Set<ShopItem> getShopItems() {
        return shopItems;
    }

    public Set<Subcategory> getSubcategories() {
        return subcategories;
    }
}
