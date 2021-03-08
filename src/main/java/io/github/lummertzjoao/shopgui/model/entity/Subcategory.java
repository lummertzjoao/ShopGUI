package io.github.lummertzjoao.shopgui.model.entity;

public class Subcategory extends Category {

    private final Category parentCategory;

    public Subcategory(String name, MenuItem menuItem, Category parentCategory) {
        super(name, menuItem);
        this.parentCategory = parentCategory;
    }

    public Category getParentCategory() {
        return parentCategory;
    }
}
