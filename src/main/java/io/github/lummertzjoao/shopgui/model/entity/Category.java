package io.github.lummertzjoao.shopgui.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Category extends MenuItem {

    private String name;

    private final Set<Product> products = new HashSet<>();
    private final Set<Subcategory> subcategories = new HashSet<>();

    public Category(String name, MenuItem menuItem) {
        super(menuItem.getSlot(), menuItem.getIcon(), menuItem.getLore());
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
